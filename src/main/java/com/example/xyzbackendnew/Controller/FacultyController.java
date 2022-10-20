package com.example.xyzbackendnew.Controller;

import com.example.xyzbackendnew.Model.FacultyModel;
import com.example.xyzbackendnew.dao.FacultyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
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

    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/deleteF",consumes = "application/json", produces = "application/json")
    public String deleteFaculty(@RequestBody FacultyModel faculty) {
        dao.deleteFacultyById(faculty.getId());
        return "{status:'Success'}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchF",consumes = "application/json",produces = "application/json")
    public List<FacultyModel>searchFaculty(@RequestBody FacultyModel faculty){
        return (List<FacultyModel>) dao.searchFaculty(faculty.getName());
    }
}