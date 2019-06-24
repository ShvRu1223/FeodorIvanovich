package com.course.sss.webservice;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class HtmlHandler implements HttpHandler {

    public static final String HTML_FORMAT="^/pages/(([a-zA-Z]+\\.)(html))$";

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {

        String path=httpExchange.getRequestURI().getPath();
        String response="";
        if(path.matches(HTML_FORMAT)){
            response=path;
        }else{
            response="INVALID URI: "+path;
        }

        File file=new File("webclient"+path);
        response+="<br> file Exists: "+file.exists()+"<br>";

        byte[] fileBytes=null;
        if(file.exists()){
            fileBytes=Utils.readBytes("webclient"+path);
        }

        httpExchange.getResponseHeaders().set("Content-Type","text/html");
        httpExchange.sendResponseHeaders(200,0);
        OutputStream os=httpExchange.getResponseBody();
        //os.write(("Html Handler: "+response).getBytes());
        if(fileBytes!=null){
            os.write(fileBytes);
        }
        os.close();
    }
}
