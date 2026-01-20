package com.example.Student_Management.repository;

import com.example.Student_Management.model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository <StudentModel,String>{  // Id primary key hai or uska type String hai isliye String likhe hai

}
