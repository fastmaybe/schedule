package com.spring.schedule.schedulejob.task;

/**
 * @Author: liulang
 * @Date: 2020/12/11 18:13
 */
public class TaskTwo {

    public void live(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("live: "+System.currentTimeMillis()/1000);
    }

    public static void staticMe(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("staticMe: "+System.currentTimeMillis()/1000);
    }
}
