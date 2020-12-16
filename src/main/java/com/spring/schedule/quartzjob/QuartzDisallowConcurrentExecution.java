package com.spring.schedule.quartzjob;

import com.spring.schedule.pojo.DyQuartzJob;
import com.spring.schedule.quartzjob.utils.JobInvokeUtil;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;

/**
 * @Author: liulang
 * @Date: 2020/12/14 11:10
 */
@DisallowConcurrentExecution
public class QuartzDisallowConcurrentExecution extends AbstractQuartzJob {
    @Override
    void doExecute(JobExecutionContext context, DyQuartzJob quartzJob) {
        JobInvokeUtil.invokeJob(quartzJob);
    }
}
