package com.demo.springboot.spring03mybatis.controller;

import com.demo.springboot.spring03mybatis.dao.StudentDao;
import com.demo.springboot.spring03mybatis.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 测试控制器
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-15 12:01
 * @Emil: 381889220@qq.com
 */
@RestController
public class TestController {
    @Resource
    private StudentDao studentDao;

    @RequestMapping("/get")
    public List<Student> getTest01(){
        return studentDao.getStudent();
    }
}
