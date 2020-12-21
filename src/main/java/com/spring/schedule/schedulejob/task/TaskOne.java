package com.spring.schedule.schedulejob.task;

import com.spring.schedule.mapper.ScheduleJobMapper;
import com.spring.schedule.pojo.ScheduleJob;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;

/**
 * @Author: liulang
 * @Date: 2020/12/11 17:54
 */
@Component
public class TaskOne {

    @Resource
    private ScheduleJobMapper scheduleJobMapper;

    public void runOne(){

        ScheduleJob job = scheduleJobMapper.selectByPrimaryKey(1);
        System.out.println(job.toString());
        System.out.println(System.currentTimeMillis()/1000);
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public void runTwo(){
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid+"[开始]"+System.currentTimeMillis()/1000);
        System.out.println(Thread.currentThread().getName());

        System.out.println(uuid+"[结束]"+System.currentTimeMillis()/1000);
        System.out.println();
    }

        public void runThree(String params){
            String[] split = params.split(",");
            System.out.println(Arrays.toString(split));
            System.out.println(System.currentTimeMillis()/1000);
            System.out.println();
        }
}
