package com.spring.schedule.schedulejob;

import com.spring.schedule.pojo.ScheduleJob;

import java.util.List;

/**
 * @Author: liulang
 * @Date: 2020/12/21 18:21
 */
public interface IJobDetail {

    public List<ScheduleJob> findAllJob();

    public ScheduleJob findOne(ScheduleJob job);

    public void onCronError(ScheduleJob job,Exception e);

    public void onError(ScheduleJob job,Exception e);

    public void onComplete(ScheduleJob job);
}
