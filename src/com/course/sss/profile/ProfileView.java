package com.course.sss.profile;

import com.course.sss.common.BaseView;
import com.course.sss.common.Canvas;
import com.course.sss.common.CompositeView;

public class ProfileView extends CompositeView {
    @Override
    public void draw(){
        System.out.println("criminal profile:");
        System.out.println("Id : "+((ProfileModel)model).getId());
        System.out.println("Name : "+((ProfileModel)model).getName());
        System.out.println("active : "+((ProfileModel)model).isActive());
    }


    public void init(){
        ProfilePhotoView photoView=new ProfilePhotoView(30,4,10);
        children.add(photoView);
    }

    @Override
    public void draw(Canvas canvas) {
        for (BaseView view:children){
            view.draw();
        }
        canvas.drawText("criminal profile:");
        canvas.drawText("Id : "+((ProfileModel)model).getId());
        canvas.drawText("Name : "+((ProfileModel)model).getName());
        canvas.drawText("active : "+((ProfileModel)model).isActive());
    }
}
