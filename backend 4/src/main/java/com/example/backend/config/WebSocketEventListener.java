package com.example.backend.config;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class WebSocketEventListener {
    
    @EventListener
    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event)
    {
     //To be implemented    
    }
    
}
