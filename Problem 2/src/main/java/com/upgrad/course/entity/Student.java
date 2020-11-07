package com.upgrad.course.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

//TODO: Mark the Student class with @Table annotation to map it with the 'Student_details' table in the database
@Entity
@Table(name = "Student_details")
public class Student {

//  TODO: Use the @GeneratedValue annotation to generate primary key values automatically using the
//   strategy attribute and its value as "GenerationType.AUTO"
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;
}
