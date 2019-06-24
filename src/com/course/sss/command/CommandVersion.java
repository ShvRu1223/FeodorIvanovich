package com.course.sss.command;

import com.course.sss.FeodorIvanych;

public class CommandVersion extends ACommand {

    public CommandVersion(String name) {
        super(name);
    }

    @Override
    public void execute(){
        System.out.println("My version is : "+ FeodorIvanych.VERSION);//Application.VERSION
    }
}
