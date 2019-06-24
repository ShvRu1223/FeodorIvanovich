package com.course.sss.command;

import com.course.sss.FeodorIvanych;

import java.sql.SQLOutput;

public class CommandAuthor extends ACommand {

    public CommandAuthor(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Author is "+ FeodorIvanych.AUTHOR);
    }
}
