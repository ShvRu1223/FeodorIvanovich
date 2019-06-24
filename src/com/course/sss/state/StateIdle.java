package com.course.sss.state;

import com.course.sss.FeodorIvanych;
import com.course.sss.command.ACommand;

public class StateIdle extends ApplicationState {
    @Override
    public void enter(String CommandName) {
        System.out.println("Entering Idle state");
    }

    @Override
    public void onCommand(String command) {
        System.out.println("new command recieved");
        FeodorIvanych.changeState(new StateExecutingCommand(), command);
    }

    @Override
    public void exit() {
        System.out.println("Exiting Idle state");
    }
}
