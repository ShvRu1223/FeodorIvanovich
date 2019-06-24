package com.course.sss.dbservice.dbstate;

public abstract class DBState {

    protected String name;

    public DBState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
