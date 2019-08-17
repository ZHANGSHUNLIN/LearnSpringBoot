package com.zs.spring02jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

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
    @RequestMapping(value = {"/view","/"})
    public String getTest01(Map<String,String> map){
        map.put("list", "zhangSan");
        map.put("name", "李四");
        return "view";
    }
}
