package com.example.xyzbackendnew.dao;

import com.example.xyzbackendnew.Model.FacultyModel;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FacultyDao extends CrudRepository<FacultyModel,Integer> {
    @Modifying
    @Query(value = "DELETE FROM `faculty` WHERE `id`= :id",nativeQuery = true)
    void deleteFacultyById(Integer id);

    @Query(value ="SELECT `id`, `joining`, `address`, `d_name`, `des_name`, `dob`, `education`, `mob`, `name` FROM `faculty` WHERE name =:name",nativeQuery = true)
    List<FacultyModel> searchFaculty(String name);
}


