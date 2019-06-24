package com.course.sss.common;

public abstract class BaseView {

    protected BaseModel model;



    public void draw(){
        System.out.println("drawing should be implemented .....");
    }
    public void draw(Canvas canvas){
        System.out.println("drawing on canvas should be implemented .....");
    }

    public void setModel(BaseModel model){
        this.model=model;
    }
}
