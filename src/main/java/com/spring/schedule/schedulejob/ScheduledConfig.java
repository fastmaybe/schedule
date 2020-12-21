package com.spring.schedule.schedulejob;

import com.spring.schedule.pojo.ScheduleJob;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @Author: liulang
 * @Date: 2020/12/21 18:39
 */
@Configuration
public class ScheduledConfig extends  AbstractScheduledConfig{




    @Override
    IJobDetail attachJobDetail() {
        return new IJobDetail() {
            @Override
            public List<ScheduleJob> findAllJob() {
                return null;
            }

            @Override
            public ScheduleJob findOne(ScheduleJob job) {
                return null;
            }

            @Override
            public void onCronError(ScheduleJob job, Exception e) {

            }

            @Override
            public void onError(ScheduleJob job, Exception e) {

            }

            @Override
            public void onComplete(ScheduleJob job) {

            }
        };
    }
}
