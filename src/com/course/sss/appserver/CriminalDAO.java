package com.course.sss.appserver;

import java.util.List;

public interface CriminalDAO {

    ModelCriminal get(int id);
    List<ModelCriminal> getAll();
    List<ModelCriminal> getAll(String filter);
    void safe (ModelCriminal model);
    void update (ModelCriminal model);
    void delete (int id);


}
