package com.course.sss.profile;

import com.course.sss.common.ConsoleCanvas;

public class ProfileController {

    private ProfileModel profileModel;
    private ProfileView view;
    private ProfileStore store;
    private ConsoleCanvas canvas;

    {
        store.INSTANCE.loadData();
        view=new ProfileView();
        //canvas=new ConsoleCanvas();
    }

    public void showProfile(int id){
        ProfileModel model = store.INSTANCE.getProfile(id);
        if(model==null){
            System.out.println("didn't find any record with id: "+id);
        }else{
            view.setModel(model);
            view.draw();//view.draw(canvas);
        }
//        ProfileView view=new ProfileView();
//        ProfileModel model =new ProfileModel();
//        model.setActive(true);
//        model.setFirstName("fernando");
//        model.setLastName("alonso");
//        model.setId(1);
//        view.setModel(model);
//        view.draw();
    }
}
