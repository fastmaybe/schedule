package com.spring.schedule.quartzjob.utils;

import com.spring.schedule.pojo.DyQuartzJob;
import com.spring.schedule.quartzjob.QuartzCons;
import com.spring.schedule.quartzjob.QuartzDisallowConcurrentExecution;
import com.spring.schedule.quartzjob.QuartzJobExecution;
import org.quartz.*;

import java.util.TimeZone;

/**
 * @Author: liulang
 * @Date: 2020/12/14 11:49
 */
public class DYQuartzUtils {


    public static void createQuartzJob(Scheduler scheduler, DyQuartzJob job) throws SchedulerException {

        JobDetail jobDetail = JobBuilder.newJob(attachJobClass(job)).withIdentity(attachJobKey(job)).build();

        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCron());
        attachJobCronConfig(cronScheduleBuilder, job);
        cronScheduleBuilder.inTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));

        //按新的cronExpression表达式构建一个新的trigger
        CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(attachTriggerKey(job))
                .withSchedule(cronScheduleBuilder).build();

        //放入自定义参数 运行可以获取
        jobDetail.getJobDataMap().put(QuartzCons.JobInfoCons.DY_QUARTZ_JOB,job);

        if (scheduler.checkExists(attachJobKey(job))){
            scheduler.deleteJob(attachJobKey(job));
        }

        scheduler.scheduleJob(jobDetail,trigger);

        //将暂停状态的 暂停
        if (QuartzCons.Status.NORMAL != job.getStatus() ){
            scheduler.pauseJob(attachJobKey(job));
        }
    }

    /**
     * 构建任务触发对象
     * @param job
     * @return
     */
    public static TriggerKey attachTriggerKey(DyQuartzJob job) {
      return   TriggerKey.triggerKey(QuartzCons.JobInfoCons.JOB_KET_PRE+job.getId(),job.getGroup());
    }

    /**
     * 设置定时任务策略
     * @param cb
     * @param job
     */
    private static void attachJobCronConfig(CronScheduleBuilder cb, DyQuartzJob job) {
        switch (job.getMisfirepolicy()){
            case QuartzCons.JobType.MISFIRE_IGNORE_MISFIRES:
                cb.withMisfireHandlingInstructionIgnoreMisfires();
                break;
            case QuartzCons.JobType.MISFIRE_FIRE_AND_PROCEED:
                cb.withMisfireHandlingInstructionFireAndProceed();
                break;
            case QuartzCons.JobType.MISFIRE_DO_NOTHING:
                cb.withMisfireHandlingInstructionDoNothing();
                break;
            default:
        }
    }

    /**
     * 构建任务键对象
     * @param job
     * @return
     */
    public static JobKey attachJobKey(DyQuartzJob job) {
        return JobKey.jobKey(QuartzCons.JobInfoCons.JOB_KET_PRE+job.getId(),job.getGroup());
    }

    private static Class<? extends Job> attachJobClass(DyQuartzJob job) {
       return QuartzCons.ConcurrentConfig.CONCURRENT == job.getConcurrent() ? QuartzJobExecution.class : QuartzDisallowConcurrentExecution.class;
    }
}
