package com.course.sss.appserver;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

class ApplicationHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String path=httpExchange.getRequestURI().getPath();
        String command=path.substring(5);
        httpExchange.getResponseHeaders().set("Context-Type","text/html");
        httpExchange.sendResponseHeaders(200,0);
        OutputStream os=httpExchange.getResponseBody();
        os.write(command.getBytes());
        os.close();
    }
}
