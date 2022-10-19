package com.example.xyzbackendnew.dao;

import com.example.xyzbackendnew.Model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {
}
