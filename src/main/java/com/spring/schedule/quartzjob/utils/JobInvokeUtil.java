package com.spring.schedule.quartzjob.utils;

import com.spring.schedule.pojo.DyQuartzJob;
import com.spring.schedule.util.SpringUtils;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Author: liulang
 * @Date: 2020/12/14 11:11
 */
public class JobInvokeUtil {


    public static void invokeJob(DyQuartzJob quartzJob) {
        try {
            Class<?> clazz = Class.forName(quartzJob.getInvokeClass());
            Object bean = null;
            try {
                bean = SpringUtils.getBean(clazz);
            } catch (NoSuchBeanDefinitionException e) {
                bean = clazz.newInstance();
            }
            Method method = clazz.getMethod(quartzJob.getInvokeMethod());
            method.invoke(Modifier.isStatic(method.getModifiers()) ? null : bean);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
