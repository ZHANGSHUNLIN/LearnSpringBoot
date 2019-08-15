package com.demo.springboot.spring03mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <p>
 * 班级实体
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-15 11:52
 * @Emil: 381889220@qq.com
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Classes {
    private Integer id;
    private String name;
}
