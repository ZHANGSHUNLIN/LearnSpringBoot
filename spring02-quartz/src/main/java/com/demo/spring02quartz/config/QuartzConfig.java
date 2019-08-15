package com.demo.spring02quartz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * quartz配置文件
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-14 19:33
 * @Emil: 381889220@qq.com
 */
@Configuration
public class QuartzConfig {
    @Bean("dateFormat")
    public SimpleDateFormat simpleDateFormate(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

}
