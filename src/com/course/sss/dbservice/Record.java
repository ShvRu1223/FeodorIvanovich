package com.course.sss.dbservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Record {

    List<String> values;
    List<String> coloumns;


    {
        values=new ArrayList<>();
    }

    public void addValue(String value){

    }

    public Record(Table table){
        coloumns=table.getColoumns();

    }

    public void setValues(String[] values){
        this.values.clear();
        this.values=Arrays.asList(values);
    }

    public int getInt(String fieldName)throws FilledNotFoundException{
        int index=coloumns.indexOf(fieldName);
        if(index==-1){
            throw new FilledNotFoundException("File not found: "+fieldName);
        }
        return Integer.parseInt(values.get(index));
    }

    public int getInt(String fieldName,int defaultValue) throws FilledNotFoundException {
        int index=coloumns.indexOf(fieldName);
        if(index==-1){
            throw new FilledNotFoundException("File not found: "+fieldName);
        }
        String valuesString=values.get(index);
        if (valuesString==null){
            return defaultValue;
        }
        return Integer.parseInt(valuesString);
    }


    public class FilledNotFoundException extends Exception{
        public FilledNotFoundException(String msg){
            super(msg);
        }
    }

    public boolean getBoolean(String fieldName) throws FilledNotFoundException {
        int index=coloumns.indexOf(fieldName);
        if(index==-1){
            throw new FilledNotFoundException("File not found: "+fieldName);
        }
        return Boolean.parseBoolean(values.get(index));
    }

}
