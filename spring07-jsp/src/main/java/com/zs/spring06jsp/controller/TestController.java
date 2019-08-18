package com.zs.spring06jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-18 00:18
 * @Emil: 381889220@qq.com
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String getTest01() {
        return "index";
    }
}
