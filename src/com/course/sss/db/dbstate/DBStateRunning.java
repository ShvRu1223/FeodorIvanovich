package com.course.sss.db.dbstate;

import com.course.sss.db.DBApplication;

public class DBStateRunning extends DBState {

    @Override
    public void enter() {
        System.out.println("Entering DBRunning state");
    }

    @Override
    public void onStop() {
        //check if everything is ok
        DBApplication.INSTANCE.changeState(DBApplication.INSTANCE.stateStop);
    }


}
