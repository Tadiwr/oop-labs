package com.tadiwa.person;

public class Student extends  Person{

    public String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }
}
