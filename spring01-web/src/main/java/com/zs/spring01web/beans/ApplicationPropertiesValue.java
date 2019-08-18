package com.zs.spring01web.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 自定义属性
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-13 22:01
 * @Emil: 381889220@qq.com
 */
@Component
public class ApplicationPropertiesValue {
    @Value("${properties.name}")
    private String str;

    public String getRandomValue() {
        return str;
    }

}
