package com.zs.spring06jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * <p>
 *
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-18 00:15
 * @Emil: 381889220@qq.com
 */
@SpringBootApplication
public class Spring07JspApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Spring07JspApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Spring07JspApplication.class);
    }
}
