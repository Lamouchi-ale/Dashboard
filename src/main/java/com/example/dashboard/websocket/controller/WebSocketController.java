package com.example.dashboard.websocket.controller;

import com.example.dashboard.websocket.service.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/websocket")
public class WebSocketController {

    @Autowired
    private WebSocketService webSocketService;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        webSocketService.sendMessageToAll(message);
        return "Message envoyé à tous les clients WebSocket : " + message;
    }
}
