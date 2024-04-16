package com.example.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;


@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer
{
    

    //way for clients to connect to our server
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry)
    {
        //we need to use ws, can be connected from anywhere and using sockJS
        registry.addEndpoint("/ws").setAllowedOrigins("*").withSockJS();   
    }

    //now, we need to setup how messages should be sent to clients
    public void configureMessageBroker(MessageBrokerRegistry registry)
    {
         registry.enableSimpleBroker("/topic");
         //when clients want to send messages, they should put /app before their message so that it goes to right place
         registry.setApplicationDestinationPrefixes("/app");
    }
    
}