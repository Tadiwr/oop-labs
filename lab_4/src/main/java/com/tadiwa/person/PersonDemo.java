package com.tadiwa.person;

import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {

        // Basic 1
        Person person1 = new Person("Tawanda", 21);
        Student student1 = new Student("Tadiwanashe", 22, "Operations Research");

        List<Person> people = List.of(person1, student1);

        people.forEach(Person::display);

        // Basic 2

        Teacher teacher1 = new Teacher("Mr Norman", 45, "Computer Science");
        Student student2 = new Student("Tadiwa", 21, "Object Oriented Programming");

        List<Person> people2 = List.of(teacher1, student2);

        people2.forEach(Person::display);
    }
}

