package com.supun.spring_mqsql_dockerize.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private int id;

    private String name;

    private int age;
}
