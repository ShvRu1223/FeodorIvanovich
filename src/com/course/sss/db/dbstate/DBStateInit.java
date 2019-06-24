package com.course.sss.db.dbstate;

import com.course.sss.db.DBApplication;
import com.course.sss.db.misc.DBConstants;
import com.course.sss.db.misc.Utils;
import com.course.sss.db.misc.DataHandler;
import com.course.sss.db.data.Table;
import com.course.sss.db.data.TableMetaData;

public class DBStateInit extends DBState {
    @Override
    public void enter() {
        System.out.println("Entering DBInit state");
        initTables();
        DBApplication.INSTANCE.changeState(DBApplication.INSTANCE.stateRun);
    }

    private void initTables() {
        Utils.readDir(DBConstants.TABLE_DIR, new DataHandler() {
            @Override
            public void handleFile(String filePath) {
                TableMetaData metaData = TableMetaData.loadFromFile(filePath);
                Table table = new Table(metaData);
                table.load();
            }
        });
    }

    @Override
    public void onStop() {
        //check if everything is ok
        DBApplication.INSTANCE.changeState(DBApplication.INSTANCE.stateStop);
    }
}
