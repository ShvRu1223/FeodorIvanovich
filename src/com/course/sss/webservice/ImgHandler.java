package com.course.sss.webservice;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class ImgHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String path=httpExchange.getRequestURI().getPath();
        File file=new File("webclient"+path);

        byte[] fileBytes=null;
        if(file.exists()){
            fileBytes=Utils.readBytes("webclient"+path);
        }

        httpExchange.getResponseHeaders().set("Content-Type","image/jpeg");
        httpExchange.sendResponseHeaders(200,0);
        OutputStream os=httpExchange.getResponseBody();
        //os.write(("Html Handler: "+response).getBytes());
        if(fileBytes!=null){
            os.write(fileBytes);
        }
        os.close();
    }
}
