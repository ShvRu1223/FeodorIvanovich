package com.course.sss.command;

public class CommandWeather extends ACommand {
    public CommandWeather(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("weather");
    }
}
