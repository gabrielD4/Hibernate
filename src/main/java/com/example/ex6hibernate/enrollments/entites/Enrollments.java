package com.example.ex6hibernate.enrollments.entites;

import com.example.ex6hibernate.classes.entities.Class;
import com.example.ex6hibernate.students.entities.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Enrollments {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Class aClass;
}
