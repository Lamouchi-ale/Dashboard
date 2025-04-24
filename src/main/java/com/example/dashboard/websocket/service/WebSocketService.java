package com.example.dashboard.websocket.service;

import com.example.dashboard.websocket.handler.WebSocketMessageHandler;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import java.io.IOException;

@Service
public class WebSocketService {

    /**
     * Envoie un message à tous les clients connectés via WebSocket.
     *
     * @param message Le message à envoyer.
     */
    public void sendMessageToAll(String message) {
        for (WebSocketSession session : WebSocketMessageHandler.sessions) {
            try {
                if (session.isOpen()) {
                    session.sendMessage(new TextMessage(message));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
