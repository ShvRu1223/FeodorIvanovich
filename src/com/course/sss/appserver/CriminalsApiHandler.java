package com.course.sss.appserver;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.net.URL;
import java.io.IOException;
import java.io.OutputStream;

public class CriminalsApiHandler implements HttpHandler {

    public static final String LIST_REQUEST="^/api/criminals$"; //регулярка
    public static final String PERSON_REQUEST="^/api/criminals/[0-9]+$";//n-id

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String path=httpExchange.getRequestURI().getPath();
        String response="zzzzzzzzzzz";
        if(path.matches(LIST_REQUEST)){
            response="LIST";
        }else {
            if (path.matches(PERSON_REQUEST)) {
                response = "PERSON";
            } else {
                response = "zzzzzzz";
            }
        }
        httpExchange.getResponseHeaders().set("Context-Type","text/html");
        httpExchange.sendResponseHeaders(200,0);
        OutputStream os=httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
        System.out.println(response);
    }


    private String requestDB() throws Exception{
        URL url=new URL("https://");

        String query="";
//        OutputStream os=new OutputStream()
        return null;
    }
}
