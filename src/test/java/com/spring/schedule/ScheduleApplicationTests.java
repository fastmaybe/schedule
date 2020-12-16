package com.spring.schedule;

import com.spring.schedule.mapper.ScheduleJobMapper;
import com.spring.schedule.schedulejob.task.TaskOne;
import com.spring.schedule.util.SpringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ScheduleApplicationTests {


    @Resource
    private ScheduleJobMapper scheduleJobMapper;

    @Autowired
    private TaskOne TaskOne;


    @Test
    void contextLoads() throws InterruptedException {
        TaskOne.runTwo();
        TaskOne.runTwo();
        Thread.currentThread().join();
    }

}
