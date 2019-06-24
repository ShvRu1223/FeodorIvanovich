package com.course.sss.webservice;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class JSHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String path=httpExchange.getRequestURI().getPath();
//        String response="";
//        if(path.matches(HtmlHandler.HTML_FORMAT)){
//            response=path;
//        }else{
//            response="INVALID URI: "+path;
//        }

        File file=new File("webclient/static"+path);
//        response+="<br> file Exists: "+file.exists();

        byte[] fileBytes=null;
        if(file.exists()){
            fileBytes=Utils.readBytes("webclient/static"+path);
        }

        httpExchange.getResponseHeaders().set("Content-Type","application/javascript");
        httpExchange.sendResponseHeaders(200,0);
        OutputStream os=httpExchange.getResponseBody();
        //os.write("Css Handler".getBytes());
        if(fileBytes!=null){
            os.write(fileBytes);
        }
        os.close();
    }
}
