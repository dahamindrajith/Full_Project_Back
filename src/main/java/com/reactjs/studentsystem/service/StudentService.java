package com.reactjs.studentsystem.service;

import com.reactjs.studentsystem.model.Student;

import java.util.List;


public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getStudenr();

}
