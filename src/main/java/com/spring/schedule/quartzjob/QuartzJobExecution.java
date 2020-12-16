package com.spring.schedule.quartzjob;

import com.spring.schedule.pojo.DyQuartzJob;
import com.spring.schedule.quartzjob.utils.JobInvokeUtil;
import org.quartz.JobExecutionContext;

/**
 * @Author: liulang
 * @Date: 2020/12/14 11:10
 */
public class QuartzJobExecution extends AbstractQuartzJob {
    @Override
    void doExecute(JobExecutionContext context, DyQuartzJob quartzJob) {
        JobInvokeUtil.invokeJob(quartzJob);
    }
}
