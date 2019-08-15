package com.demo.springboot.spring04freemark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 测试
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-15 21:39
 * @Emil: 381889220@qq.com
 */
@Controller
public class TestController {

    @RequestMapping(value = "/free")
    public String freeMark(Map<String,Object> map){
        map.put("name","joe");
        map.put("sex",1);

        /*模拟数据*/
        List<Map<String, Object>> friends = new ArrayList<>();

        Map<String, Object> friend = new HashMap<>();
        friend.put("name","xbq");
        friend.put("age",22);
        friends.add(friend);

        friend = new HashMap<>();
        friend.put("name", "july");
        friend.put("age", 18);
        friends.add(friend);

        map.put("friends", friends);

        return "freeMark";
    }

}
