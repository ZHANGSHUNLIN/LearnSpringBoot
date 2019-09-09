package com.zs.spring01web.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 绑定自定义属性.
 * 偶尔发现一个细节在当前类中并没有{@code @PropertySource}配置Properties文件也可以使用{@code @Value}来
 * 绑定数据。
 * 原因：在{@code ValuePropertiesValue}类中我们已经引用过了，所以我们可以想当然的认为在Spring扫描所有的
 * 类后会收集所有配置文件然后使用。
 * 最好配置{@code @propertySources}
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
