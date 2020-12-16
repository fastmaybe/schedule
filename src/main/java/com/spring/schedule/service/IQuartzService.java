package com.spring.schedule.service;

import com.spring.schedule.pojo.DyQuartzJob;
import org.quartz.SchedulerException;

/**
 * @Author: liulang
 * @Date: 2020/12/16 11:05
 */
public interface IQuartzService {
    void changeStatus(Integer id, Integer status) throws SchedulerException;

    /**
     * 暂停
     * @param id
     */
    void pauseScheduler(Integer id) throws SchedulerException;

    /**
     * 恢复
     * @param id
     */
    void resumeScheduler(Integer id) throws SchedulerException;

    void add(DyQuartzJob job) throws SchedulerException;

    void update(DyQuartzJob job) throws SchedulerException;
}
