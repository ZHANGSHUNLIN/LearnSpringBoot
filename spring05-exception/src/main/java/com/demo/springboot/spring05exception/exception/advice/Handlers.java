package com.demo.springboot.spring05exception.exception.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * <p>
 * 异常处理
 *
 *      在类名上引用 @RestControllerAdvice 就可以使该类变为异常处理类了（相当于异常通知）
 *
 *      在方法上引用 @ExceptionHandler 参数 value 指定要处理的异常类即可 异常类可以自定义
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-15 22:30
 * @Emil: 381889220@qq.com
 */
@RestControllerAdvice
public class Handlers {
    @ExceptionHandler(value = RuntimeException.class)
    public String handleRuntimeException(){
        return "运行时异常";
    }

}
