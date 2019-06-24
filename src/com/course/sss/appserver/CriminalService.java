package com.course.sss.appserver;

public class CriminalService {

    CriminalDAO dao;

    public CriminalService(){
        dao=new JdbcCriminalDAO();


    }
    public ModelCriminal get (int id){
        return dao.get(id);
    }

}
