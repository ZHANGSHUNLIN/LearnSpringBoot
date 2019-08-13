package com.demo.spring01.spring01web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-13 17:53
 * @Emil: 381889220@qq.com
 */
@RestController
@RequestMapping(value = "/test/")
@PropertySource("classpath:value.properties")
public class TestController {

    @Value("${properties.name}")
    private String random;

    @RequestMapping(value = "hello")
    public String hello(){
        return random;
    }

}
