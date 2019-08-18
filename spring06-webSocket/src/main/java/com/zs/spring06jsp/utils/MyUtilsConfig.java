package com.zs.spring06jsp.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * <p>
 *
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-18 11:51
 * @Emil: 381889220@qq.com
 */
@Configuration //Spring容器配置
public class MyUtilsConfig {
    /**
     * 往Spring容器中放入一个ObjectMapper实例对象
     *
     * @return
     */
    @Bean("jackson")
    public ObjectMapper jacksonBean() {
        return new ObjectMapper();
    }

    /**
     * 往Spring容器中放入一个SimpleDateFormat实例对象
     *
     * @return
     */
    @Bean("dateFormat")
    public SimpleDateFormat dateFormatBean() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
