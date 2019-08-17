package com.zs.spring02jsp.config;

import com.zs.spring02jsp.websocket.MyHandShakeInterceptor;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import javax.annotation.Resource;

/**
 * <p>
 * 配置文件
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-17 18:27
 * @Emil: 381889220@qq.com
 */
public class MyWebSocketConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer {

    @Resource
    private MyHandShakeInterceptor myHandShakeInterceptor;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        //webSocketHandlerRegistry.addHandler(myHandShakeInterceptor,"/zsws").addInterceptors();
    }

}
