package com.example.xyzbackendnew.Controller;
import com.example.xyzbackendnew.Model.StudentModel;
import com.example.xyzbackendnew.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add", consumes = "application/json",produces = "application/json")
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
    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping("/delete")
    public String deleteStudent(@RequestBody StudentModel student){
        dao.deleteStudentById(student.getId());
        return "{status:'Success'}";
    }
@CrossOrigin(origins = "*")
    @PostMapping(path = "/searchStudent",consumes = "application/json", produces = "application/json")
    public List<StudentModel>searchStudent(@RequestBody StudentModel student){
        return (List<StudentModel>) dao.searchStudent(student.getName());
}

}
