package com.upgrad.course.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

//TODO: Mark the Student class with @Entity annotation so that it can be treated as an entity by Hibernate

@Entity
public class Student {

//  TODO: Use the @Id annotation to identify the "id" field as a primary key

    @Id
    private int id;
    private String name;
}
