package com.course.sss.db.dbstate;

import com.course.sss.db.data.query.QueryResult;

public abstract class DBState {

    protected String name;

    public DBState(String name){
        this.name=name;
    }
    public DBState(){}

    public void enter() {
        System.out.println("Basic entering state");
    }

    public QueryResult onQuery(String query) {
        return new QueryResult(QueryResult.Status.FAILURE, String.format("UNABLE TO PROCESS QUERY: %s", query));
    }

    public void exit() {
        System.out.println("Basic exiting state");
    }

    public void onStop() {
        System.out.println("Basic stop handling");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}
