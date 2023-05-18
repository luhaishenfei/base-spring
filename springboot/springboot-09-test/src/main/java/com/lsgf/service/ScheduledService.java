package com.lsgf.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

    static int count=0;
    // 在一个特定时间执行这个方法
//    cron 表达式      秒 分 时 日 月 周几
//    @Scheduled(cron ="* 18,22 *  *  * 0-7" )//每小时 18,22分钟就一直执行
    @Scheduled(cron ="* 18/19 *  *  * 0-7" )//每小时 18/19分钟就一直执行
    public void hello(){
        System.out.println("执行了=>hello "+count++);
    }
}
