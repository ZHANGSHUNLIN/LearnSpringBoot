package com.demo.springboot.spring03mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangShun
 */
@SpringBootApplication
@MapperScan("com.demo.springboot.spring03mybatis.dao")
public class Spring03MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring03MybatisApplication.class, args);
    }

}
