package com.demo.springboot.spring05exception.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试Controller
 * <p>
 * 这个controller里抛出了RuntimeException 在 exception.advice包中的自定义的Handlers类
 * 就会处理
 * PS：处理是因为类里面写了RuntimeException的处理方法，详情请看Handlers类
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-15 22:18
 * @Emil: 381889220@qq.com
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test")
    public String getTest() {

        if (1 == 1) {
            throw new RuntimeException();
        }

        return "Hello World";
    }
}
