package com.tadiwa.student_compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentCompareDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Marko", 78),
                new Student("Tadiwanashe", 90),
                new Student("Vjay", 66),
                new Student("Alison", 90),
                new Student("Fedrick", 45)
        )).stream().sorted().toList();

        // Students will be ordered first by marks then ordered next by their name
        students.forEach(Student::display);
    }
}
