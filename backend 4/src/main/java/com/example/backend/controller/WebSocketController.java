package com.example.backend.controller;

import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
    //here, we create methods to handle incoming and outcoming requests
    
    public String handleMessage(String message)
    {
        return message;
    }
}
