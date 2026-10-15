package com.tadiwa.person;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("\n----------------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age + " year(s)");
    }
}
