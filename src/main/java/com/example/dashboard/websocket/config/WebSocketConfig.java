package com.example.dashboard.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Le client Angular se connectera à ce point d'entrée WebSocket
        registry.addEndpoint("/ws").setAllowedOrigins("*").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // Pour envoyer des messages du serveur vers les clients
        registry.enableSimpleBroker("/topic");

        // Pour envoyer des messages du client vers le serveur (non obligatoire si tu ne fais que du broadcast)
        registry.setApplicationDestinationPrefixes("/app");
    }
}
