package com.spring.schedule.quartzjob;

/**
 * @Author: liulang
 * @Date: 2020/12/14 10:52
 */
public interface QuartzCons {

    interface Status{
        int NORMAL = 1;
        int PAUSE = 0;
    }

    interface JobType{
        int MISFIRE_DEFAULT = 0;
        int MISFIRE_IGNORE_MISFIRES = 1;
        int MISFIRE_FIRE_AND_PROCEED = 2;
        int MISFIRE_DO_NOTHING = 3;
    }

    interface ConcurrentConfig{
        int CONCURRENT = 0;
        int NOT_CONCURRENT = 1;
    }

    interface JobInfoCons{
        String JOB_KET_PRE = "TASK_CLASS_NAME";
        String DY_QUARTZ_JOB = "DY_QUARTZ_JOB";
    }
}
