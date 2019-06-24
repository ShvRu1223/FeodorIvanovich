package com.course.sss.appserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class JdbcCriminalDAO implements CriminalDAO {
    @Override
    public ModelCriminal get(int id) {

        return null;
    }

    @Override
    public List<ModelCriminal> getAll() {
        try {
            Connection connection= DriverManager.getConnection("","","");
            //connection.
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ModelCriminal> getAll(String filter) {
        return null;
    }

    @Override
    public void safe(ModelCriminal model) {

    }

    @Override
    public void update(ModelCriminal model) {

    }

    @Override
    public void delete(int id) {

    }
}
