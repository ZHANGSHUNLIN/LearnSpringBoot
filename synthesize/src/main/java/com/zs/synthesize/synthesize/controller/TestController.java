package com.zs.synthesize.synthesize.controller;

import com.zs.synthesize.synthesize.entity.TestProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-09-08 23:33
 * @Emil: 381889220@qq.com
 */
@RestController
public class TestController {
    @Resource
    private TestProperties testProperties;

    @RequestMapping(value = "/hello")
    public String getHelloHtmlPage(String page){
        return page;
    }

    @RequestMapping(value = "/tp")
    public List<Object> getTestProperties(){
        List<Object> list = new ArrayList<>();
        list.add(testProperties.getName());
        list.add(testProperties.getAge());
        return list;
    }


}
