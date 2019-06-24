package com.course.sss.dbservice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Table {

    protected List<String> coloumns;
    protected List<Record> records;
    protected String name;

    {
        records=new ArrayList<Record>();
    }

    public Table(String name,List<String> coloumns) {
        this.name = name;
        this.coloumns=coloumns;
    }

    public  void insert(Record record){
        records.add(record);
    }
    public  List<String> selectField(String fieldName){
        int index=coloumns.indexOf(fieldName);
        Iterator it=records.iterator();
        List<String> result=new ArrayList<>();
        while (it.hasNext()){
            Record r =(Record)it.next();
            result.add(r.values.get(index));
        }
        return result;
    }

    public void select(String query){

    }

    public List<String> getColoumns(){
        return coloumns;
    }

}
