package com.zs.synthesize.synthesize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 本类指导：
 *      1.默认的启动方式有缺陷  在jar包的方式启动时，可以使用后缀参数改变原来的参数配置
 *          例如： java -jar hell.jar --server.port=8082
 *                  在项目运行后，项目的端口号会被变更为8082
 *              解决：我们把原始的启动方式注释掉跟换新的启动方式
 *
 * @author zhangShun
 */
@SpringBootApplication
public class SynthesizeApplication {

    public static void main(String[] args) {
        /*  原始的启动方式
        *   SpringApplication.run(SynthesizeApplication.class, args);
        *   下面的启动方式为禁止添加公开参数 也就是在运行时添加参数是否有效
        * */
        SpringApplication springApplication = new SpringApplication(SynthesizeApplication.class);
        springApplication.setAddCommandLineProperties(false);
        springApplication.run(args);
    }

}
