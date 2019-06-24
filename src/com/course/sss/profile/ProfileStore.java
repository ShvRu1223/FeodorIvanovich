package com.course.sss.profile;

import java.util.HashMap;
import java.util.Map;

public enum  ProfileStore {
    INSTANCE;

    Map<Integer, ProfileModel> profiles;

    {
        profiles=new HashMap<>();//~конструктор (выполняется до вызова конструктора)
    }

    public void loadData(){
        for(int i=0;i<50;i++){
            ProfileModel model=ProfileModel.randomModel();
            profiles.put(model.getId(),model);
        }
    }

    public ProfileModel getProfile(int id){
        return profiles.get(id);
    }
}
