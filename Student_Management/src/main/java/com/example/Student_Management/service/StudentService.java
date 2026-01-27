package com.example.Student_Management.service;

import com.example.Student_Management.model.StudentModel;
import com.example.Student_Management.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public  class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public StudentModel addStudent(StudentModel student) {
        return repository.save(student);

    }

    public List<StudentModel> getStudents() {
        return repository.findAll();

    }
    public StudentModel updateStudent(String id,StudentModel student) {
        StudentModel existingStudent = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("no student found"));
        existingStudent.setAge(student.getAge());
        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        return repository.save(existingStudent);
    }
    public void deleteStudent(String id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Student not found");
        }
        repository.deleteById(id);
    }

//}
    //create
//    public StudentService addStudents(StudentModel student){
//
//    }
}
//Controller--->Service--->Repository--->Model