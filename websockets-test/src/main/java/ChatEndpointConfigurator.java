package com.cuu.websocket;

import javax.websocket.server.ServerEndpointConfig.Configurator;
 
public class ChatEndpointConfigurator extends Configurator {
 
    private static ChatEndpoint chatServer = new ChatEndpoint();
 
    @Override
    public <T> T getEndpointInstance(Class<T> endpointClass) throws InstantiationException {
        return (T)chatServer;
    }
}