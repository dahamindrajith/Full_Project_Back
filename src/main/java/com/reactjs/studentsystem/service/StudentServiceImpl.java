package com.reactjs.studentsystem.service;

import com.reactjs.studentsystem.model.Student;
import com.reactjs.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    public StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        System.out.println(student.getName()+"   "+student.getAdderss()+"    "+student.getId());
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudenr() {
        return studentRepository.findAll();
    }
}
