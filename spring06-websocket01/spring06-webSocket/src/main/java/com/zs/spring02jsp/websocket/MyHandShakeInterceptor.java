package com.zs.spring02jsp.websocket;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * <p>
 * 实现握手歇息
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-17 17:11
 * @Emil: 381889220@qq.com
 */
public class MyHandShakeInterceptor implements HandshakeInterceptor {
    @Override
    public boolean beforeHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse,
                                   WebSocketHandler webSocketHandler, Map<String, Object> map) throws Exception {
        //取出javax.servlet.http.HttpSession中的 uId 属性值
        System.out.println("在握手之前执行该方法.Websocket:用户连接成功 [HttpSession中属性 uId:" + ((ServletServerHttpRequest) serverHttpRequest).getServletRequest().getSession(false).getAttribute("uid"));
        if (serverHttpRequest instanceof ServletServerHttpRequest) {
            ServletServerHttpRequest servletServerHttpRequest = (ServletServerHttpRequest) serverHttpRequest;
            HttpSession httpSession = servletServerHttpRequest.getServletRequest().getSession(false);
            String sessionId = httpSession.getId();
            System.out.println("HandshakeInterceptor 开始处理一次WebSocket服务sessionId=>"+sessionId);
            System.out.println("HttpSession中的userName=>"+httpSession.getAttribute("userName"));
            System.out.println("HttpSession中的uId=>"+httpSession.getAttribute("uId"));
            System.out.println("HandshakeInterceptor WebSocketSession中的uId设置值之前 =>"+map.get("uId"));
            // 标记用户
            String uId = (String) httpSession.getAttribute("uId");
            if (uId != null) {
                map.put("uId", uId);
                map.put("userName", httpSession.getAttribute("userName"));
            } else {
                System.out.println("验证失败禁止放行。。。。");
                return false;
            }
        }
        return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse,
                               WebSocketHandler webSocketHandler, Exception e) {
        ServletServerHttpRequest servletServerHttpRequest = (ServletServerHttpRequest) serverHttpRequest;
        HttpSession httpSession = servletServerHttpRequest.getServletRequest().getSession(false);
        String sessionId = httpSession.getId();
        System.out.println("在握手之后执行该方法.处理完一次WebSocket服务 sessionId=>"+sessionId);
    }
}
