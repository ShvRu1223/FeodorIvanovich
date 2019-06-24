package com.course.sss.appserver;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public enum ServerApplication {
    INSTANCE;

    public static final int PORT=6702;

    public static final String APP_NAME="Application service";

    public void start()throws Exception{
        HttpServer server=HttpServer.create(new InetSocketAddress(PORT),10);
        server.createContext("/api/time",new ApplicationHandler());/////низходящий контекст
        server.createContext("/api/criminals", new CriminalsApiHandler());
        server.start();
        String message=String.format("%s is running on port %d",APP_NAME,PORT);
        System.out.println(message);
    }
}
