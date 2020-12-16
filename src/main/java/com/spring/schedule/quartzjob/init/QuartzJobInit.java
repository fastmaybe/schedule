package com.spring.schedule.quartzjob.init;

import com.spring.schedule.mapper.DyQuartzJobMapper;
import com.spring.schedule.pojo.DyQuartzJob;
import com.spring.schedule.pojo.DyQuartzJobExample;
import com.spring.schedule.quartzjob.utils.DYQuartzUtils;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @Author: liulang
 * @Date: 2020/12/14 11:32
 */
@Component
public class QuartzJobInit {

    @Autowired(required = false)
    private DyQuartzJobMapper dyQuartzJobMapper;

    @Autowired(required = false)
    private Scheduler scheduler;


    @PostConstruct
    public void loadJob(){
        System.out.println("QuartzJobInit...");
        DyQuartzJobExample example = new DyQuartzJobExample();
        List<DyQuartzJob> dyQuartzJobs = dyQuartzJobMapper.selectByExample(example);
        if (null != dyQuartzJobs && dyQuartzJobs.size() > 0) {
            dyQuartzJobs.forEach(job -> {
                        try {
                            DYQuartzUtils.createQuartzJob(scheduler, job);
                        } catch (SchedulerException e) {
                            e.printStackTrace();
                        }
                    }
            );
        }
    }

}
