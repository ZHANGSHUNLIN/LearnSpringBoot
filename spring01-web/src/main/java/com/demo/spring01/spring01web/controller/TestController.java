package com.demo.spring01.spring01web.controller;

import com.demo.spring01.spring01web.beans.ValuePropertiesValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.ValidationEvent;

/**
 * <p>
 *  springBoot-Web 属性自定义
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

    @Autowired
    private ValuePropertiesValue valuePropertiesValue;

    @RequestMapping(value = "hello")
    public String hello(){
        return random;
    }

    @RequestMapping(value = "value")
    public ValuePropertiesValue hello01(){
        return valuePropertiesValue;
    }

    @RequestMapping(value = "str01")
    public String hello02(){
        return "李四";
    }

}
