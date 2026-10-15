package com.tadiwa.person;

public class Teacher extends Person {
    public String subjectArea;

    public Teacher(String name, int age, String subjectArea) {
        super(name, age);
        this.subjectArea =subjectArea;
    }
}
