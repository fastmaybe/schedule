package com.spring.schedule.controller;

import com.spring.schedule.pojo.DyQuartzJob;
import com.spring.schedule.service.IQuartzService;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: liulang
 * @Date: 2020/12/16 11:07
 */
@RestController
@RequestMapping("quartz")
public class QuartzController {

    @Autowired
    private IQuartzService quartzService;


    @RequestMapping("change")
    public String changeStatus(@RequestParam("id")Integer id,
                                     @RequestParam("status")Integer status
    ) throws SchedulerException {
        if (status !=0 && status!=1) return "error status";
        quartzService.changeStatus(id,status);
        return "ok";
    }

    @PostMapping("add")
    public void add(@RequestBody DyQuartzJob job) throws SchedulerException {
       quartzService.add(job);
    }

    @PostMapping("update")
    public void update(@RequestBody DyQuartzJob job) throws SchedulerException {
        quartzService.update(job);
    }
}
