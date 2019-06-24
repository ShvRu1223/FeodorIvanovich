package com.course.sss.profile;

import com.course.sss.common.BaseView;
import com.course.sss.common.Canvas;
import com.course.sss.common.ConsoleCanvas;

public class ProfilePhotoView extends BaseView {

    private int x;
    private int y;
    private int size;

    public ProfilePhotoView(int x, int y,int size){
        this.x=x;
        this.y=y;
        this.size=size;
    }

    @Override
    public void draw(Canvas canvas) {
        ((ConsoleCanvas) canvas).drawSquare(3,5,10);
        ((ConsoleCanvas) canvas).draw();
    }
}
