package com.course.sss.webservice;

import java.util.Map;

public class Template {

    public String templateFileName;///html page
    public Map<String,String> values;

    public Template(String templateFileName, Map<String, String> values) {
        this.templateFileName = templateFileName;
        this.values = values;
    }

    public String compile(){
        String templateText= "";//Utils.readFile(templateFileName);//read file disk
        for(String s: values.keySet()){
            templateText=templateText.replace("{{"+s+"}}",values.get(s));
        }
        return templateText;
    }
    //values.put("firstName","Vasiliy");
}
