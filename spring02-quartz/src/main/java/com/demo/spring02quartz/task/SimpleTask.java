package com.demo.spring02quartz.task;

import com.demo.spring02quartz.config.QuartzConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.Date;

/**
 * <p>
 * 简单的任务
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-14 19:45
 * @Emil: 381889220@qq.com
 */
@Component("simpleTask")
@EnableScheduling
public class SimpleTask {

    @Autowired
    private MyTask myTask;

    @Resource
    private QuartzConfig quartzConfig;

    @Scheduled(fixedRate = 1000*3)
    public void reportCurrTime(){
        myTask.say();
        System.out.println("每隔三秒调用一次现在是："+quartzConfig.simpleDateFormate().format(new Date()));
    }

}
