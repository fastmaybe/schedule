package com.spring.schedule.schedulejob;

/**
 * @Author: liulang
 * @Date: 2020/12/11 19:02
 */
@SuppressWarnings("all")
public interface TaskType {

    /**默认是fixedDelay 上一次执行完毕时间后执行下一轮*/
//    @Scheduled(cron = "0/5 * * * * *")

    /**fixedRate:fixedRate就是每隔多长时间执行一次。(开始------->X时间------>再开始)。
     * 如果间隔时间小于任务执行时间，上一次任务执行完成下一次任务就立即执行。
     * 如果间隔时间大于任务执行时间，就按照每隔X时间运行一次。
     */
//    @Scheduled(fixedRate = 5000)

    /**fixedDelay:而fixedDelay是当任务执行完毕后一段时间再次执行。
     * （开始--->结束(隔一分钟)开始----->结束）。上一次执行任务未完成，下一次任务不会开始。
     */

//    @Scheduled(fixedDelay = 5000)

    /**第一次延迟2秒后执行，之后按fixedDelay的规则每5秒执行一次*/
//    @Scheduled(initialDelay = 2000, fixedDelay = 5000)




    /**
     * 任务执行完毕
     */
    final String FixedDelay ="FixedDelay";
    final String Trigger ="Trigger";
    final String FixedRate ="FixedRate";


}
