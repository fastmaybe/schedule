package com.spring.schedule.service.impl;

import com.spring.schedule.mapper.DyQuartzJobMapper;
import com.spring.schedule.pojo.DyQuartzJob;
import com.spring.schedule.quartzjob.QuartzCons;
import com.spring.schedule.quartzjob.utils.DYQuartzUtils;
import com.spring.schedule.service.IQuartzService;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: liulang
 * @Date: 2020/12/16 11:05
 */
@Service
public class QuartzServiceImpl implements IQuartzService {

    @Autowired(required = false)
    private Scheduler scheduler;


    @Autowired(required = false)
    private DyQuartzJobMapper quartzJobMapper;

    @Override
    public void changeStatus(Integer id, Integer status) throws SchedulerException {

        if (QuartzCons.Status.PAUSE == status){
            pauseScheduler(id);
        }else {
            resumeScheduler(id);
        }

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void pauseScheduler(Integer id) throws SchedulerException {
        DyQuartzJob job = quartzJobMapper.selectByPrimaryKey(id);
        job.setStatus(QuartzCons.Status.PAUSE);
        quartzJobMapper.updateByPrimaryKeySelective(job);
        scheduler.pauseJob(DYQuartzUtils.attachJobKey(job));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void resumeScheduler(Integer id) throws SchedulerException {
        DyQuartzJob job = quartzJobMapper.selectByPrimaryKey(id);
        job.setStatus(QuartzCons.Status.NORMAL);
        quartzJobMapper.updateByPrimaryKeySelective(job);
        scheduler.resumeJob(DYQuartzUtils.attachJobKey(job));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void add(DyQuartzJob job) throws SchedulerException {
        quartzJobMapper.insert(job);
        JobKey jobKey = DYQuartzUtils.attachJobKey(job);
        if (scheduler.checkExists(jobKey)){
            scheduler.deleteJob(jobKey);
        }
        DYQuartzUtils.createQuartzJob(scheduler,job);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(DyQuartzJob job) throws SchedulerException {
        quartzJobMapper.updateByPrimaryKeySelective(job);
        JobKey jobKey = DYQuartzUtils.attachJobKey(job);
        if (scheduler.checkExists(jobKey)){
            scheduler.deleteJob(jobKey);
        }
        DYQuartzUtils.createQuartzJob(scheduler,job);
    }
}
