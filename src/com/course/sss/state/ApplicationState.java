package com.course.sss.state;

import com.course.sss.command.ACommand;

public abstract class ApplicationState {

    public abstract void enter(String CommandName);

    public abstract void onCommand(String commandName);

    public abstract void exit();
}
