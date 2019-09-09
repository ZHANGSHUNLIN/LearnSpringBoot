package com.zs.spring01web.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 自动导入properties配置文件里的参数。在使用{@code @PropertySource}注入properties文件后使用
 * {@code @ConfigurationProperties}来配置（prefix）前缀，属性名字和配置文件的属性名字相对应
 * 即可绑定不需要再使用{@code @Value}来绑定属性值了。
 * 注意：在jdk8或者后面开发时
 *      1.{@code @PropertySource}可以同时配置多个properties文件
 *      2.多个{@code @PropertySource}也可以写在{@code @PropertySources}里面。
 *          下面的引入可以写成这样：
 *              @ PropertySources({
 *              @ PropertySource("classpath:application.properties"),
 *              @ PropertySource("classpath:value.properties")
 * })
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-13 22:43
 * @Emil: 381889220@qq.com
 */
@Component
@PropertySource("classpath:application.properties")
@PropertySource("classpath:value.properties")
@ConfigurationProperties(prefix = "properties")
public class ValuePropertiesValue {
    private String name;
    private String random_value;
    private String value01;
    private String value02;
    @Value("${shuZi.zs}")
    private String uuid;
    public ValuePropertiesValue() {
    }

    public ValuePropertiesValue(String name, String random_value, String value01, String value02) {
        this.name = name;
        this.random_value = random_value;
        this.value01 = value01;
        this.value02 = value02;
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
