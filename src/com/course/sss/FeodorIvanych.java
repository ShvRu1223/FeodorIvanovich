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

        try {
           DBApplication.INSTANCE.start();
           ServerApplication.INSTANCE.start();
           WebClientApplication.INSTANCE.start();
       } catch (Exception e) {
           e.printStackTrace();
       }

    }
//     private static void runTests(String className)throws Exception{
//         int passed=0;
//         int failed=0;
//         for(Method m: Class.forName(className).getMethods()){
//             Test testAnnotation=m.getAnnotation(Test.class);
//             if(testAnnotation!=null&&testAnnotation.enabled()){
//                 try{
//                     m.invoke(null);
//                     passed++;
//                 }catch(Throwable ex){
//                     System.out.printf("Test %s failed: %s \n",m,ex.getCause());
//                     failed++;
//                 }
//             }
//         }
//         System.out.println();
//     }
//     public static void changeState(ApplicationState newState,String commandName){
//         if (currentState!=null){
//             currentState.exit();
//         }
//         currentState=newState;
//         currentState.onCommand(commandName);
//     }
//     public static void printList(List<String> list,String filter){
//         for(String s: list){
//             if(s.matches(filter)){
//                 System.out.println(s);
//             }
//         }
//     }

//     public static void printList(List<String>list){
//         for(String s:list){
//             System.out.println(s);
//         }
//     }

//     public static void forEachLineup(List<String> list,String filter){
//         for(String s:list){
//             if(!s.matches(filter)){
//                 list.remove(s);
//             }
//         }
//     }

//     public static void iteratorCleanUp(List<String> list,String filter){
//         Iterator<String> it=list.iterator();
//         while(it.hasNext()){
//             String s=  it.next();
//             if(!s.matches(filter)){
//                 it.remove();
//             }
//         }
//     }
}
