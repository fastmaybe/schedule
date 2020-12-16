package com.spring.schedule.schedulejob;

import com.spring.schedule.mapper.ScheduleJobMapper;
import com.spring.schedule.pojo.ScheduleJob;
import com.spring.schedule.util.SpringUtils;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Author: liulang
 * @Date: 2020/12/11 17:10
 */
public class DYScheduledTask implements ScheduledOfTask {

    private ScheduleJob job;

    public DYScheduledTask(ScheduleJob job) {
        this.job = job;
    }

    @Override
    public void execute() {
        try {
            Class<?> clazz = Class.forName(job.getCronClass());
            Object bean = null;
            try {
                bean = SpringUtils.getBean(clazz);
            } catch (NoSuchBeanDefinitionException e) {
                bean = clazz.newInstance();
            }
            Method method = clazz.getMethod(job.getCronMethod());
            method.invoke(Modifier.isStatic(method.getModifiers()) ? null : bean);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean beOn() {
        ScheduleJobMapper mapper = SpringUtils.getBean(ScheduleJobMapper.class);
        return mapper.selectByPrimaryKey(job.getId()).getStatus() == 1;
    }
}
