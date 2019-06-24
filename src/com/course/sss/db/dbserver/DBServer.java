package com.course.sss.db.dbserver;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Arrays;

public enum DBServer {
    INSTANCE;

    public static final int PORT=6701;

    public static final String HTML=
            "<html>"+
                    "<head></head>"+
                    "<body>%s</body>"+
            "</html>";

    public void start() throws Exception{
        HttpServer server=HttpServer.create(new InetSocketAddress(PORT),10);
        server.createContext("/api/query", new QueryHandler());
        server.start();
        String message= String.format("Server is running on port: %d",DBServer.PORT);
        System.out.println(message);
    }

}
