package com.course.sss.webservice;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class APIPostHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        InputStream is=httpExchange.getRequestBody();
        byte[] requestBytes=new byte[is.available()];
        is.read(requestBytes);


        httpExchange.getResponseHeaders().set("Content-Type","application/json");//text/html
        httpExchange.sendResponseHeaders(200,0);
        OutputStream os=httpExchange.getResponseBody();
        os.write(requestBytes);
        //os.write("Css Handler".getBytes());

        os.close();
    }
}
