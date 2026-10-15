package com.tadiwa.student_compare;

public class Student implements Comparable<Student> {
    public String name;
    public int mark;

    public Student(String name, int mark) {
        this.mark = mark;
        this.name = name;
    }

    public void display() {
        System.out.println("Student name=" + this.name + " mark=" + this.mark);
    }

    @Override
    public int compareTo(Student other) {
        int nameCompare = this.name.compareTo(other.name);
        int markCompare = Integer.compare(other.mark, this.mark);

        // EXPLAIN: If two students have equal marks then compare them by their names
        if (markCompare == 0) {
            return nameCompare;
        }

        return markCompare;
    }
}
