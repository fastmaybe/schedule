package com.spring.schedule.quartzjob.task;

/**
 * @Author: liulang
 * @Date: 2020/12/14 14:52
 */
public class TaskFour {

    public void live(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("live: "+System.currentTimeMillis()/1000);
    }

    public static void staticMe(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("staticMe: "+System.currentTimeMillis()/1000);
    }
}
