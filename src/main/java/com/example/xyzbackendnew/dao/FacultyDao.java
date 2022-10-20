package com.example.xyzbackendnew.dao;

import com.example.xyzbackendnew.Model.FacultyModel;
import com.example.xyzbackendnew.Model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface FacultyDao extends CrudRepository<FacultyModel,Integer> {
}
