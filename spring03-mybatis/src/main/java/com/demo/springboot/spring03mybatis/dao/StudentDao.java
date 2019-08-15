package com.demo.springboot.spring03mybatis.dao;

import com.demo.springboot.spring03mybatis.entity.Student;

import java.util.List;

/**
 * <p>
 * 学生的Dao
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-15 12:03
 * @Emil: 381889220@qq.com
 */
public interface StudentDao {
    /**获取所有的学生信息
     * @return 学生集合
     */
    List<Student> getStudent();
}
