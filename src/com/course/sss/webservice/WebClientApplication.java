package com.course.sss.webservice;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public enum WebClientApplication {
    INSTANCE;

    public static final int PORT=6703;
    public static final String APP_NAME="Web client service qwerty";

    public void start() throws IOException {
        HttpServer server=HttpServer.create(new InetSocketAddress(PORT),10);
        server.createContext("/pages/", new HtmlHandler());
        server.createContext("/css/", new CSSHandler());
        server.createContext("/js/",  new JSHandler());
        server.createContext("/api/GET", new APIGetTetxHandler());
        server.createContext("/api/testpost", new APIPostHandler());
        server.createContext("/api/criminals",new ApiCrimoinalsHandler());
//        server.createContext("/dbservice/state", new HttpHandler() {
//            @Override
//            public void handle(HttpExchange httpExchange) throws IOException {
//                String state="Init";
//                httpExchange.sendResponseHeaders(200,state.length());
//                httpExchange.getResponseHeaders().put("Content-Type:", Arrays.asList(new String[]{"text/html"}));
//                OutputStream os=httpExchange.getResponseBody();
//                os.write(state.getBytes());
//                os.close();
//            }
//        });
        server.start();
        String message= String.format("%s is running on port: %d",APP_NAME ,server.getAddress().getPort());
        System.out.println(message);
    }
}
