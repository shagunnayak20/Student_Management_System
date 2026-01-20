package com.example.Student_Management.service;

import com.example.Student_Management.model.StudentModel;
import com.example.Student_Management.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class StudentService {
    private StudentRepository repository;

    public StudentService(StudentRepository rep) {
        this.repository = rep;
    }
    public StudentModel addStudent(StudentModel student){
        return repository.save(student);

    }

    public List<StudentModel> getAllStudents() {
        return repository.findAll();

    }
    //Create
//    public StudentService addStudents(StudentModel student){
//
//    }
}
//Controller--->Service--->Repository--->Model