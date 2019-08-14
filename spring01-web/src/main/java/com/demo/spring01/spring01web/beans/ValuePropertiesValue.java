package com.demo.spring01.spring01web.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 自定义的properties
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-13 22:43
 * @Emil: 381889220@qq.com
 */
@Component
@PropertySource("classpath:value.properties")
@ConfigurationProperties(prefix = "properties")
public class ValuePropertiesValue {
    private String name;
    private String random_value;
    private String value01;
    private String value02;


    public ValuePropertiesValue() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRandom_value() {
        return random_value;
    }

    public void setRandom_value(String random_value) {
        this.random_value = random_value;
    }

    public String getValue01() {
        return value01;
    }

    public void setValue01(String value01) {
        this.value01 = value01;
    }

    public String getValue02() {
        return value02;
    }

    public void setValue02(String value02) {
        this.value02 = value02;
    }

    public ValuePropertiesValue(String name, String random_value, String value01, String value02) {
        this.name = name;
        this.random_value = random_value;
        this.value01 = value01;
        this.value02 = value02;
    }
}
