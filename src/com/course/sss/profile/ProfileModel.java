package com.course.sss.profile;

import com.course.sss.common.BaseModel;
import com.course.sss.dbservice.Record;

import java.util.Date;

public class ProfileModel extends BaseModel {
    private int id;
    private String firstName;
    private String lastName;
    private String nickname;
    int numberOfCrimes;
    Date dateOfBirth;
    Date dateOfDeath;
    private boolean active;
    boolean deceased;


    public static ProfileModel randomModel(){
        int rId=(int)(10*Math.random());
        boolean rActive=rId%2==0;
        String rFirstName="feodor "+rId;
        String rLastName="ivanych"+rId;
        return new ProfileModel(rId,rFirstName,rLastName,rActive);
    }


    public ProfileModel(int id, String firstName, String lastName, boolean active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
    }

    public ProfileModel(){}

    public static ProfileModel modelFromRecord(Record record){
        ProfileModel model=new ProfileModel();
        try{
        model.setId(record.getInt("id"));
        //model.setDeseased(record.getBoolean("dexeased"))
            }catch(Exception e){e.printStackTrace();}
        return  model;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName(){
        return firstName+" "+lastName;
    }
}
