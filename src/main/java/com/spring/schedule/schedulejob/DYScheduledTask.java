package com.spring.schedule.schedulejob;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.spring.schedule.mapper.ScheduleJobMapper;
import com.spring.schedule.pojo.ScheduleJob;
import com.spring.schedule.util.SpringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

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
            String params = job.getParams();
            try {
                bean = SpringUtils.getBean(clazz);
            } catch (NoSuchBeanDefinitionException e) {
                bean = clazz.newInstance();
            }

            if (null == params || StringUtils.isEmpty(params)) {
                Method method = clazz.getMethod(job.getCronMethod());
                method.invoke(Modifier.isStatic(method.getModifiers()) ? null : bean);
                //没有参数
            } else {
                //有参数
                Method method = clazz.getMethod(job.getCronMethod(), String.class);
                method.invoke(Modifier.isStatic(method.getModifiers()) ? null : bean, params);
            }

        } catch (Exception e) {
            //todo 出现异常最好 将其标记为异常状态 或者 通知 因为下次还是会继续执行
            e.printStackTrace();
        }

    }

    @Override
    public boolean beOn() {
        ScheduleJobMapper mapper = SpringUtils.getBean(ScheduleJobMapper.class);
        return mapper.selectByPrimaryKey(job.getId()).getStatus() == 1;
    }

    public static void main(String[] args) throws Exception {

        Gson gson = new GsonBuilder().create();

        Class<?> clazz = Class.forName("com.spring.schedule.schedulejob.task.TaskOne");
        ScheduleJob job = new ScheduleJob();
        job.setDesc("desc");
        HashMap<String, ScheduleJob> map = new HashMap<>();
        map.put("test",job);
        String name = null;
        String sss = gson.toJson(name);
        String mapStr = gson.toJson(map);
        String jobStr = gson.toJson(job);

        List<String> paramsStr = Arrays.asList(sss, mapStr, jobStr);


        Method[] methods = clazz.getMethods();
        Optional<Method> runThree = Arrays.stream(methods).filter(e -> "runThree".equals(e.getName())).findFirst();
        Object bean = clazz.newInstance();

        Method method = runThree.get();


        int parameterCount = method.getParameterCount();
        Class<?>[] classes = method.getParameterTypes();
        Object[] prams = new Object[parameterCount];
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
            prams[i] = gson.fromJson(paramsStr.get(i),classes[i]);
        }
        System.out.println(Arrays.toString(prams));
        method.invoke(bean,prams);
        System.out.println();

    }
}
