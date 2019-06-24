package com.course.sss;

import com.course.sss.db.dbserver.DBServer;
import com.course.sss.db.test.Test;
import com.course.sss.state.ApplicationState;
import com.course.sss.state.StateIdle;

import java.lang.reflect.Method;
import java.util.*;

public class FeodorIvanych {


    public static final String DATE_ENCRYPT_LEVEL="LOW";

    public static final String OP_GROUP="(SELECT|DELETE)";
    public static final String FLD_GROUP="([*a-zA-Z, ]+)+";
    public static final String SPACE="([\\s]+)";
    public static final String FROM_GROUP="(FROM)";
    public static final String TBL_GROUP="([a-zA-Z]+)$";


    public static final String ALLOWED_DOMAIN_NAMES="^([a-zA-Z0-9]+\\.)*[a-z]+$";

    public static final String VERSION="0.0.0.2";
    public static final String AUTHOR="Author";
    static ApplicationState currentState;

    public static void main(String[] args){
        currentState=new StateIdle();
//        ACommand command=new ACommand("anonymous") {
//            @Override
//            public void execute() {
//                System.out.println("anonymous");
//                System.out.println(this.getClass());
//            }
//        };
//        command.execute();
//        String commandName="test command";
//        currentState.onCommand(commandName);





        /*System.out.println("xxxxx");
        Scanner in=new Scanner(System.in);
        String commandName=in.nextLine();
        ACommand command=CommandRegistry.INSTANCE.getCommand(commandName);
        command.execute();*/
//        String commandName="version";
//        ACommand command=CommandRegistry.INSTANCE.getCommand(commandName);
//        command.execute();
//        commandName="author";
//        command=CommandRegistry.INSTANCE.getCommand(commandName);
//        command.execute();
//        CommandRegistry.INSTANCE.listCommands();


//        changeState(new StateIdle(),"Idle");
//        String commandName="trext command";
//        for (int i=0; i<10;i++){
//            currentState.onCommand(commandName+i+"");}


//        ProfileController controller=new ProfileController();
//        controller.showProfile(23);

         /*Runnable run1=new Runnable() {
             @Override
             public void run() {
                for(int i=0;i<10;i++){
                    System.out.print("-");
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
             }
         };
         Thread thread=new Thread(){
             @Override
             public void run() {
                 for(int i=0;i<10;i++){
                     System.out.print(".");
                     try{
                         Thread.sleep(500);
                         //System.out.println(this.getState());
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
                 System.out.println("done");
             }
         };
         System.out.print("\nLoading");
         //System.out.println(thread.getState());
         //new Thread(run1).start();
         thread.start();*/


//        ConsoleCanvas canvas=new ConsoleCanvas(50,70);
//        canvas.setSybolAt(0,4,'Q');
//        canvas.drawSquare(40,10,21);
//        canvas.drawCircle(30,20,10);
//        canvas.draw();

        /*List<String> coloumns=new ArrayList<>();
        coloumns.add("id");
        coloumns.add("lastname");
        coloumns.add("firstname");
        Table table=new Table("Criminals",coloumns);
        List<String> values=new ArrayList<>();
        List<String> values2=new ArrayList<>();
        values.add("1");
        values.add("vvvvv") ;
        values.add("TYTTTTT");

        values2.add("13");
        values2.add("vvvvv") ;
        values2.add("TYTTTTT");
        table.insert(new Record(values));
        table.insert(new Record(values2));

        List<String> result=table.selectField("lastname");
        for(String s: result){
            System.out.println(s);
        }*/



//        DataBase dbservice=new DataBase();
//        Thread thread=new Thread(){
//          @Override
//          public void run(){
//              try{
//                  Thread.sleep(1000);
//              } catch (InterruptedException e) {
//                  e.printStackTrace();
//              }
//              dbservice.select();
//          }
//        };
//        Runnable run=new Runnable() {
//            @Override
//            public void run() {
//                dbservice.update();
//            }
//        };
//        thread.start();
//        new Thread(run).start();




//        List<String[]> records=DataBase.readDataFile("Имя файла");
//        Table table = new Table("Criminals", Arrays.asList(new String[]{"id","name","deceased"}));
//        for(String[]s: records){
//            Record rec=new Record(table);
//            rec.setValues(s);
//            table.insert(rec);
//        }
//        Record rec=new Record(table);
//        rec.setValues(new String[]{"100","Soprano","false"});
//        try{
//            System.out.println(rec.getInt("id"));
//            System.out.println(rec.getBoolean("deceased"));
//        } catch (Record.FilledNotFoundException e) {
//            e.printStackTrace();
//        } catch (NumberFormatException ex){
//            ex.printStackTrace();
//        }finally {
//            System.out.println("everything is fine");
//        }




//        List<String> list=new ArrayList<>();
//        list.add("developer.apple.com");
//        list.add("google.com");
//        list.add("wrong.");
//        list.add(".another");
//        list.add("this is wrong domain name");
//        list.add("facebook.com");
//        list.add("nasa.gov");
//        list.add("");
//
//        //iteratorCleanUp(list,ALLOWED_DOMAIN_NAMES);
//        //printList(list);
//
//        String query="SELECT * FROM Criminals";
//        Pattern p=Pattern.compile(OP_GROUP+SPACE+FLD_GROUP+SPACE+FROM_GROUP+SPACE+TBL_GROUP);
//        Matcher matcher=p.matcher(query);
//        if(matcher.find()){
//            System.out.println("Number of groups "+matcher.groupCount());
//            for(int i =0,len=matcher.groupCount();i<=len;i++){
//                System.out.println("Group "+i+": "+matcher.group(i));
//            }
//        }

//        ProfilePhotoView view=new ProfilePhotoView(5,5,5);
//        ConsoleCanvas canvas=new ConsoleCanvas(20,20);
//        view.draw(canvas);


        //в DBApplication
//        TestWhere01 test01=new TestWhere01();
//        test01.run();
//        TestWhere02 test02=new TestWhere02();
//        test02.run();
/*
        boolean testEnabled=Boolean.valueOf(System.getProperty("et"));
        if(testEnabled){
            try{
                FeodorIvanych.runTests("com.course.sss.db.test.WHERETest");
            }catch(Exception e){
                e.printStackTrace();
            }
//            TestCase testCase=new TestCase();
//            testCase.runTests();
        }*/

        try{
            DBServer.INSTANCE.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        for(Method m:FeodorIvanych.class.getDeclaredMethods()){
//            System.out.printf("\nMethod: %s",m);
//        }


        //changeState(new StateIdle());

//        try {
//            DBApplication.INSTANCE.start();
//            ServerApplication.INSTANCE.start();
//            WebClientApplication.INSTANCE.start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
    private static void runTests(String className)throws Exception{
        int passed=0;
        int failed=0;
        for(Method m: Class.forName(className).getMethods()){
            Test testAnnotation=m.getAnnotation(Test.class);
            if(testAnnotation!=null&&testAnnotation.enabled()){
                try{
                    m.invoke(null);
                    passed++;
                }catch(Throwable ex){
                    System.out.printf("Test %s failed: %s \n",m,ex.getCause());
                    failed++;
                }
            }
        }
        System.out.println();
    }
    public static void changeState(ApplicationState newState,String commandName){
        if (currentState!=null){
            currentState.exit();
        }
        currentState=newState;
        currentState.onCommand(commandName);
    }
    public static void printList(List<String> list,String filter){
        for(String s: list){
            if(s.matches(filter)){
                System.out.println(s);
            }
        }
    }

    public static void printList(List<String>list){
        for(String s:list){
            System.out.println(s);
        }
    }

    public static void forEachLineup(List<String> list,String filter){
        for(String s:list){
            if(!s.matches(filter)){
                list.remove(s);
            }
        }
    }

    public static void iteratorCleanUp(List<String> list,String filter){
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String s=  it.next();
            if(!s.matches(filter)){
                it.remove();
            }
        }
    }
}
