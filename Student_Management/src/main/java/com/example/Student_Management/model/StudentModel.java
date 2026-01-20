package com.example.Student_Management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Data
@AllArgsConstructor //all constructor
@NoArgsConstructor  // null constructor
@Document(collection ="Student")
public class StudentModel {
    @Id //primary key
    private String id;
    private String name;
    private int age;
    private String email;
}
