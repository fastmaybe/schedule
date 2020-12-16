package com.spring.schedule.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: liulang
 * @Date: 2020/12/11 16:40
 */
@Component
public class SpringUtils implements BeanFactoryPostProcessor {
    /** Spring应用上下文环境  */
    private static ConfigurableListableBeanFactory beanFactory;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        beanFactory = configurableListableBeanFactory;

    }

    public static  <T> T getBean(Class<T> clazz){
       return beanFactory.getBean(clazz);
    }

}
