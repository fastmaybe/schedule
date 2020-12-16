package com.spring.schedule.quartzjob.task;

import com.spring.schedule.mapper.DyQuartzJobMapper;
import com.spring.schedule.pojo.DyQuartzJob;
import com.spring.schedule.pojo.DyQuartzJobExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: liulang
 * @Date: 2020/12/14 14:32
 */
@Component
public class TaskThree {
    @Autowired(required = false)
    private DyQuartzJobMapper dyQuartzJobMapper;


    public void runOne(){

        DyQuartzJobExample jobExample = new DyQuartzJobExample();

        List<DyQuartzJob> jobs = dyQuartzJobMapper.selectByExample(jobExample);

        jobs.forEach(System.out::println);

    }
}
