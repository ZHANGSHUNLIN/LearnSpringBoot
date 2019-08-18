package com.demo.springboot.spring03mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * <p>
 * 学生实体
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-15 11:50
 * @Emil: 381889220@qq.com
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    private Integer id;
    private String name;
    private String sex;
    private String phone;
    private String qq;
    private Date birthday;
    private String className;
    private Classes classes;

}
