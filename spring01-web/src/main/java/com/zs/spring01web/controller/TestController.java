package com.zs.spring01web.controller;

import com.zs.spring01web.beans.ApplicationPropertiesValue;
import com.zs.spring01web.beans.ValuePropertiesValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * springBoot-Web 属性自定义
 * {@code @PropertySource} 绑定一个properties配置文件，绑定后可以用{@code @Value}在属性上绑定需要的值即可。
 * 下面的是一个绑定的示例。
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-13 17:53
 * @Emil: 381889220@qq.com
 */
@RestController
@RequestMapping(value = "/")
@PropertySource("classpath:value.properties")
public class TestController {

    @Value("${properties.name}")
    private String random;

    @Autowired
    private ValuePropertiesValue valuePropertiesValue;

    @Autowired
    private ApplicationPropertiesValue applicationPropertiesValue;

    @RequestMapping(value = "hello")
    public String hello() {
        return random;
    }

    @RequestMapping(value = "value")
    public ValuePropertiesValue hello01() {
        return valuePropertiesValue;
    }

    @RequestMapping(value = "str01")
    public String hello02() {
        return applicationPropertiesValue.getRandomValue();
    }

    @RequestMapping(value = "hello02")
    public String hello03() {
        return valuePropertiesValue.getUuid();
    }

}
