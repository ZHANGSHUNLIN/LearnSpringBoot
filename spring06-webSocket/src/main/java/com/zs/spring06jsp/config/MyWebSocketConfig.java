package com.zs.spring06jsp.config;

import com.zs.spring06jsp.handler.MyWebSocketHandler;
import com.zs.spring06jsp.websocket.MyHandShakeInterceptor;
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

    private MyWebSocketHandler myWebSocketHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        //WebSocket通道
        webSocketHandlerRegistry.addHandler(myWebSocketHandler, "/myWebsocket").addInterceptors(new
                MyHandShakeInterceptor());
        webSocketHandlerRegistry.addHandler(myWebSocketHandler, "/myWebsocket/sockjs").addInterceptors(new
                MyHandShakeInterceptor()).withSockJS();
        //-------------------- 允许跨域访问WebSocket ------------------------
        String[] allowsOrigins = {"*"};//允许连接的域,只能以http或https开头

    }

}
