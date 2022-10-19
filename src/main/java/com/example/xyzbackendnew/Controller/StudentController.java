package com.example.xyzbackendnew.Controller;
import com.example.xyzbackendnew.Model.StudentModel;
import com.example.xyzbackendnew.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/studentEntry", consumes = "application/json",produces = "application/json")
    public String studentEntry(@RequestBody StudentModel student) {
        System.out.println(student.toString());
        dao.save(student);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<StudentModel>view(){
        return (List<StudentModel>)dao.findAll();

    }

}
