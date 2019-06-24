package com.course.sss.state;

import com.course.sss.FeodorIvanych;
import com.course.sss.command.ACommand;

import java.sql.SQLOutput;

public class StateExecutingCommand extends ApplicationState {
    @Override
    public void enter(String commandName) {
        System.out.println("Entering State Executing command" + commandName);
        executeCommand(commandName);
    }

    private void executeCommand(String commandName){
        FeodorIvanych.changeState(new StateIdle(),commandName);
    }
    @Override
    public void onCommand(String command) {
        System.out.println("Busy executing command"+command);
    }

    @Override
    public void exit() {
        System.out.println("leaving state executing command");
    }
}
