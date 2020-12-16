package com.spring.schedule.schedulejob;

/**
 * @Author: liulang
 * @Date: 2020/12/11 16:39
 */
public interface ScheduledOfTask extends Runnable {


    void execute();

    @Override
    default void run(){
        if (beOn()){
            execute();
        }
    }

    boolean beOn();
}
