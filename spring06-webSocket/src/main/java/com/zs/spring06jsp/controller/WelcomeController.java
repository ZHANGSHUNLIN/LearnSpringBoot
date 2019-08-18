package com.zs.spring06jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * <p>
 *
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-18 11:45
 * @Emil: 381889220@qq.com
 */
@Controller
public class WelcomeController {
    /**
     * 项目默认首页
     */
    @RequestMapping("/")
    public String index(HttpSession session) {
        session.setAttribute("uId", this.randomUserId());//在用户登录成功后设置用户登录信息
        session.setAttribute("userName", "你猜我是谁" + UUID.randomUUID());//在用户登录成功后设置用户登录信息
        return "forward:index.html";//重定向到首页 public/index.html
//return "forward:/stu/login.html";//默认转发
//return "/login.html";//默认转发
    }

    /**
     * 随机获取一个[1-10]范围的用户uId
     *
     * @return
     */
    private String randomUserId() {
        String uId = "";
        Integer d = (int) (1 + Math.floor(Math.random() * 10));
        uId = String.valueOf(d);
        System.out.println("WelcomController随机获取一个[1-10]范围的用户uId=>" + uId);
        return uId;
    }
}


