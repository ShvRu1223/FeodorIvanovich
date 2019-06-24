package com.course.sss.webservice;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.URLConnection;

public class ApiCrimoinalsHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        //check path
        URL url=new URL("https://localhost:6702/api/criminals");
        HttpURLConnection conn=(HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
//        BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
//        String line;
//        while()
//        DocFlavor.URL url=new DocFlavor.URL("6702/api/criminals");
//        HttpURLConnection conn=(HttpURLConnection)url.openconnecrion();
//        conn.setRequestMethod("GET");//---
        //send result to browser
        InputStream is=conn.getInputStream();

        byte[] bytes = new byte[is.available()];
        is.read(bytes);
        is.close();

        File file=new File("webclient/snippets/criminaltablerow.html");
        byte[] fileBytes=null;
        if(file.exists()){
            fileBytes=Utils.readBytes("webclient/snippets/criminaltablerow.html");
        }

        String result="";
        String values= new String(bytes);
        String template=new String(fileBytes);


        String[] records=values.split(";");
        for (String s : records){
            String html=new String(template);
            String[] raw=s.split(",");
            for (int i=0;i<raw.length;i++){
                html=html.replace("{{"+i+"}}",raw[i]);
            }
            result+=html;
        }


        httpExchange.getResponseHeaders().set("Content-Type","text/plain");
        httpExchange.sendResponseHeaders(200,0);
        OutputStream os=httpExchange.getResponseBody();
        os.write(result.getBytes());
        os.close();



    }
}
