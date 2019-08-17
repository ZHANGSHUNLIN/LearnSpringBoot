package com.demo.springboot.spring06websocket.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * <p>
 * 处理类
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-17 18:37
 * @Emil: 381889220@qq.com
 */
@Component
public class MyWebSocketHandler implements WebSocketHandler {

    private static Map<String,WebSocketSession> userIdMap = new HashMap<>();

    @Autowired
    private ObjectMapper jackson;

    @Override
    public void afterConnectionEstablished(WebSocketSession webSocketSession) throws Exception {
        System.out.println("@OnOpen webSocketSession中的userName=>"+webSocketSession.getAttributes().get("userName"));//取出weSocketSession中的当前用户名称
        System.out.println("@OnOpen webSocketSession中的uId=>"+webSocketSession.getAttributes().get("uId"));//取出weSocketSession中的当前用户Id
        String uId = (String) webSocketSession.getAttributes().get("uId");
        if (uId != null) {
            userIdMap.put(uId, webSocketSession);//客户端连接服务器时,把当前用户Id和当前用户weSocketSession存储起来备用,以后用weSocketSession给客户端发消息
        }
//测试发送一句回复的话
        sendMessageToUser(uId, uId + "你好我是服务器发送来的数据你接收到显示在控制台了吧");
    }

    @Override
    public void handleMessage(WebSocketSession webSocketSession, WebSocketMessage<?> webSocketMessage) throws Exception {
        System.err.println("@OnMessage服务器接收到客户端的数据=>"+webSocketMessage.getPayload().toString());
        if (webSocketMessage.getPayloadLength() == 0) {
            return;
        }
        //Message msg=jackson.readValue(message.getPayload().toString(),Message.class);
        //Message msg=new ObjectMapper().readValue(message.getPayload().toString(),Message.class);
        //sendMessageToUser(msg.getTo(), new TextMessage(new ObjectMapper().writeValueAsString(msg)));
        String toUserId = (String) webSocketSession.getAttributes().get("uId");//取出自己的uId
        String toUserMessage = "你好你自己发的你自己收到我的数据了吗";
        sendMessageToUser(toUserId, toUserMessage);//给指定userId的用户发送信息
        String broadMessage = "大家好,我是新来的,请多多关照!!!";
        broadcast(broadMessage);//给当前服务器所有客户端发送信息

    }

    @Override
    public void handleTransportError(WebSocketSession webSocketSession, Throwable throwable) throws Exception {
        String uId = (String) webSocketSession.getAttributes().get("uId");
        System.err.println("@OnError服务器与"+uId+"客户端"+webSocketSession.getAttributes().get("userName")+"通信异常错误=>"+throwable);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession webSocketSession, CloseStatus closeStatus) throws Exception {

    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

    /**
     * 给某个用户发送消息
     * @param message 信息
     * @param uid 信息
     * @throws IOException 读写一场
     */
    private void sendMessageToUser(String uid, String message)throws IOException {
        WebSocketSession session = userIdMap.get(uid);
        if (session != null && session.isOpen()) {
            session.sendMessage(new TextMessage(message));
        }
    }

    /**
     * 给所有在线用户发送消息
     * 多线程发送
     * @param message
     * @throws IOException
     */
    public void broadcast(final String message) throws IOException {
        final TextMessage textMessage = new TextMessage(message);
        Iterator<Map.Entry<String, WebSocketSession>> it = userIdMap.entrySet().iterator();
        // 多线程群发
        while (it.hasNext()) {
            final Map.Entry<String, WebSocketSession> entry = it.next();
            if (entry.getValue().isOpen()) {
        // entry.getValue().sendMessage(message);

                new Thread(new Runnable() {
                 @Override
                 public void run() {
                try {
                    if (entry.getValue().isOpen()) {
                        entry.getValue().sendMessage(textMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
                }).start();
            }
        }
    }

}
