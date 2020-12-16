package com.spring.schedule.quartzjob;

import com.spring.schedule.pojo.DyQuartzJob;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @Author: liulang
 * @Date: 2020/12/14 10:22
 */
public abstract class AbstractQuartzJob  implements Job {

    private ThreadLocal<Date> threadLocal = new ThreadLocal<>();

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // 获取job
        DyQuartzJob quartzJob = new DyQuartzJob();
        //取出来复制一个 避免后续改动了 因为是地址引用
        BeanUtils.copyProperties(context.getMergedJobDataMap().get(QuartzCons.JobInfoCons.DY_QUARTZ_JOB),quartzJob);

        try {
            doBefore(context,quartzJob);

            doExecute(context,quartzJob);

            doAfter(context,quartzJob);
        } catch (Exception e) {
            doAfter(context,quartzJob);
            e.printStackTrace();

        }

    }


     abstract void doExecute(JobExecutionContext context, DyQuartzJob quartzJob);



    private void doAfter(JobExecutionContext context, DyQuartzJob quartzJob) {
    }


    private void doBefore(JobExecutionContext context, DyQuartzJob quartzJob) {

    }



}
