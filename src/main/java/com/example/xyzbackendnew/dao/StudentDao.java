package com.example.xyzbackendnew.dao;

import com.example.xyzbackendnew.Model.StudentModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {
    @Modifying
    @Query(value = "DELETE FROM `students` WHERE `id` = :id",nativeQuery = true)
    void deleteStudentById(Integer id);
   @Query(value = "SELECT `id`, `adnumber`, `blood`, `cname`, `dname`, `dob`, `email`, `gaddress`, `gname`, `name`, `pname`, `rollnumber` FROM `students` WHERE name =:name",nativeQuery = true)
    List<StudentModel>searchStudent(String name);
}

