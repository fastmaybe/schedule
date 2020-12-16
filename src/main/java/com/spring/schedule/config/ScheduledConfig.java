package com.spring.schedule.config;

import com.spring.schedule.mapper.ScheduleJobMapper;
import com.spring.schedule.pojo.ScheduleJob;
import com.spring.schedule.pojo.ScheduleJobExample;
import com.spring.schedule.schedulejob.DYScheduledTask;
import com.spring.schedule.schedulejob.TaskType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.IntervalTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: liulang
 * @Date: 2020/12/11 16:14
 */
@Configuration
public class ScheduledConfig implements SchedulingConfigurer {

    @Autowired
    private ApplicationContext context;


    @Resource
    private ScheduleJobMapper scheduleJobMapper;

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {

        //
        taskRegistrar.setScheduler(threadPoolTaskScheduler());

        ScheduleJobExample example = new ScheduleJobExample();
        List<ScheduleJob> scheduleJobs = scheduleJobMapper.selectByExample(example);

        scheduleJobs.forEach(job->{
            Class<?> clazz;
            Object taskJob;

            try {
                clazz = Class.forName(job.getCronClass());
//                 taskJob = context.getBean(clazz);
//                Assert.isAssignable(ScheduledOfTask.class, job.getClass(), "定时任务类必须实现ScheduledOfTask接口");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            DYScheduledTask task = new DYScheduledTask(job);


            switch(job.getTaskType().trim()){
                case TaskType.FixedDelay:
                    taskRegistrar.addFixedDelayTask(task, Long.parseLong(job.getCronExpression()));
                    break;
                case TaskType.Trigger:
                    taskRegistrar.addTriggerTask(task,
                            triggerContext -> {
                                String cronExpression = scheduleJobMapper.selectByPrimaryKey(job.getId()).getCronExpression();
                                return new CronTrigger(cronExpression).nextExecutionTime(triggerContext);
                            }
                    );
                    break;
                case TaskType.FixedRate:
                    taskRegistrar.addFixedRateTask(new IntervalTask(task,Long.parseLong(job.getCronExpression()),Long.parseLong(job.getInitialdelay())));
                    break;
                default:
            }
        });

    }

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler(){
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(10);
        scheduler.initialize();
        return scheduler;
    }

    @Bean("taskExecutor")
    public Executor taskExecutor() {

        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 核心线程数10：线程池创建时候初始化的线程数
//        executor.corePoolSize()
        // 最大线程数20：线程池最大的线程数，只有在缓冲队列满了之后才会申请超过核心线程数的线程
//        executor.maxPoolSize(15)
        // 缓冲队列200：用来缓冲执行任务的队列
        executor.setQueueCapacity(200);
        // 允许线程的空闲时间60秒：当超过了核心线程数之外的线程在空闲时间到达之后会被销毁
        executor.setKeepAliveSeconds(60);
        // 线程池名的前缀：设置好了之后可以方便定位处理任务所在的线程池
        executor.setThreadNamePrefix("taskExecutor-order");
        /*
        线程池对拒绝任务的处理策略：这里采用了CallerRunsPolicy策略，
        当线程池没有处理能力的时候，该策略会直接在 execute 方法的调用线程中运行被拒绝的任务；
        如果执行程序已关闭，则会丢弃该任务
         */
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        // 设置线程池关闭的时候等待所有任务都完成再继续销毁其他的Bean
        executor.setWaitForTasksToCompleteOnShutdown(true);
        // 设置线程池中任务的等待时间，如果超过这个时候还没有销毁就强制销毁，以确保应用最后能够被关闭，而不是阻塞住。
        executor.setAwaitTerminationSeconds(600);
        return executor;
    }

}
