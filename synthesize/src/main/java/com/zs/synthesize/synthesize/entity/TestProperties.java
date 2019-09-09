package com.zs.synthesize.synthesize.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 测试自定义文件
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-09-09 00:01
 * @Emil: 381889220@qq.com
 */
@Component
@PropertySource("classpath:test.properties")
@ConfigurationProperties(prefix = "testproperties")
public class TestProperties {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
