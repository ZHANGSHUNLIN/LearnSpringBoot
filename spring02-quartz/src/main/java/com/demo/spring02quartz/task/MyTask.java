package com.demo.spring02quartz.task;

import org.springframework.stereotype.Component;

/**
 * <p>
 * 定时任务
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-14 19:38
 * @Emil: 381889220@qq.com
 */
@Component("myTask01")
public class MyTask {
    private int count;

    public void say(){
        System.out.println("任务调度==>"+count++);
    }

}
