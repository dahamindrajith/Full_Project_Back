package com.reactjs.studentsystem.controller;

import com.reactjs.studentsystem.model.Student;
import com.reactjs.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add( @RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is added";
    }

    @GetMapping("/getstudent")
    public List<Student> getStudent(){
        return studentService.getStudenr();
    }

}
