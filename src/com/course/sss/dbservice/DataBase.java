package com.course.sss.dbservice;

import com.course.sss.DataHandler;

import java.io.*;
import java.util.*;

public class DataBase {

    public static final String[] CRIMINALS_COLOUMNS=new String[]{"id","firstname"};

    static final Map<String,Table> tables;

    private Object tableLock=new Object();

    static {
        tables= new HashMap<>();
        tables.put("Criminals",new Table("Criminals", Arrays.asList(CRIMINALS_COLOUMNS)));
        tables.put("CrimeFamily",new Table("CrimeFamily",Arrays.asList(CRIMINALS_COLOUMNS)));// свой массив

    }

    public void init(){
        //подгрузка данных
    }

    public  List<Record> select() {
        System.out.println("Starting fetching records...");
        synchronized (tableLock) {
            try {
                Thread.sleep(500);
                System.out.println("finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            return null;
    }


    public  void update(){
        System.out.println("Starting updating records...");
        synchronized (tableLock) {
            try {
                Thread.sleep(10000);
                System.out.println("finished updating");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void delete(){

    }
    public void insert(Record record,Table table){

    }

    public static List<String[]> readDataFile(String fileName, DataHandler handler)  {
        List<String[]> result=new ArrayList<>();
        FileInputStream fis=null;
        BufferedReader bufferedReader;
        try{
            fis=new FileInputStream(fileName);
            bufferedReader=new BufferedReader(new InputStreamReader(fis));
            String line;
            while ( (line=bufferedReader.readLine())!=null){
                //handler.handle(line);
                result.add(line.split(";"));
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
            fis.close();}catch(IOException e){e.printStackTrace();}
        }
        return result;
    }
}
