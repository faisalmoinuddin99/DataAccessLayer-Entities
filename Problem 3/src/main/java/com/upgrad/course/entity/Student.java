package com.upgrad.course.entity;
import javax.persistence.*;

@Entity
@Table(name= "Student_details")
public class Student {

    @Id
    private int id;

//  TODO: Mark the field "student_name" with @Column annotation to map it with the column "NAME" in the database
//    using the three attributes, name with the value "NAME", length of 200 and nullable being false

    @Column(name = "NAME", length = 200, nullable = false)
    private String student_name;
    private int age;
}

