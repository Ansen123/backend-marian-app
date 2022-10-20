package com.example.xyzbackendnew.Controller;

import com.example.xyzbackendnew.Model.FacultyModel;
import com.example.xyzbackendnew.Model.StudentModel;
import com.example.xyzbackendnew.dao.FacultyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacultyController {
    @Autowired
    private FacultyDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addF", consumes = "application/json", produces = "application/json")
    public String FacultyEntry(@RequestBody FacultyModel faculty) {
        System.out.println(faculty.toString());
        dao.save(faculty);
        return "{status:'Success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewF")
    public List<FacultyModel> view() {
        return (List<FacultyModel>) dao.findAll();
    }
}