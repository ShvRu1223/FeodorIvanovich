package com.course.sss.db.dbserver;

import com.course.sss.db.misc.DataHandler;
import com.course.sss.db.misc.Utils;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;

public class QueryHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        InputStream is=httpExchange.getRequestBody();
        final DBQueryRequest dbQueryRequest=new DBQueryRequest();
        Utils.readStream(is, new DataHandler() {
            @Override
            public void handleString(String line) {
                System.out.println(String.format("DB says, request body is %s", line));
                dbQueryRequest.setQueryString(line);
            }
        });
    }

    private class DBQueryRequest {
        String queryString;
        public String getQueryString(){
            return queryString;
        }
        public void setQueryString(String queryString){
            this.queryString=queryString;
        }
    }
}
