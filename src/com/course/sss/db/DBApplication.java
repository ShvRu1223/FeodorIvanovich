package com.course.sss.db;

import com.course.sss.db.data.Table;
import com.course.sss.db.data.query.QueryResult;
import com.course.sss.db.dbserver.DBServer;
import com.course.sss.db.dbstate.DBState;
import com.course.sss.db.dbstate.DBStateInit;
import com.course.sss.db.dbstate.DBStateRunning;
import com.course.sss.db.dbstate.DBStateStop;

import java.util.HashMap;
import java.util.Map;

public enum DBApplication {
    INSTANCE;

    private Map<String, Table> tables=new HashMap<>();

    public static final String DATA_ENCRYPTION_LEVEL = "LOW";
    private DBState currentState;
    public DBState stateInit = new DBStateInit();
    public DBState stateRun = new DBStateRunning();
    public DBState stateStop = new DBStateStop();

    public void start() throws Exception {

        DBServer.INSTANCE.start();
        changeState(stateInit);
    }

    public void stop() {
        currentState.onStop();
    }

    public QueryResult query(String query) {
        return currentState.onQuery(query);
    }

    public void changeState(DBState state) {
        if (currentState != null) {
            if (currentState.equals(state)) {
                return;
            } else {
                currentState.exit();
            }
        }
        currentState = state;
        currentState.enter();
    }
    public String getStateName(){
        return currentState.getName();
    }

    public void addTable(String tableName,Table table){
        tables.put(tableName,table);
    }

    public Table getTable(String tableName){
        return tables.get(tableName);
    }

}
