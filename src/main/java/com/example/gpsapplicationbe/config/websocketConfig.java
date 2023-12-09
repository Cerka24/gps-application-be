package com.example.gpsapplicationbe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocket
public class websocketConfig implements WebSocketMessageBrokerConfigurer {
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic");
        config.setApplicationDestinationPrefixes("/app");
    }

    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/landingPage").setAllowedOrigins("*").withSockJS();
        registry.addEndpoint("/registerForm").setAllowedOrigins("*").withSockJS();
        registry.addEndpoint("/logInForm").setAllowedOrigins("*").withSockJS();
        registry.addEndpoint("/driverDashboard").setAllowedOrigins("*").withSockJS();
        registry.addEndpoint("/driverDashboard/{userId}").setAllowedOrigins("*").withSockJS();
        registry.addEndpoint("/carDetails/{userId}").setAllowedOrigins("*").withSockJS();
        registry.addEndpoint("/carDetailsForm").setAllowedOrigins("*").withSockJS();
    }
}
