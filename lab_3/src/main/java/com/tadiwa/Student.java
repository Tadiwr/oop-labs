package com.tadiwa;

public class Student {
    private final String name;
    private int mark = 0;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {return name;}
    public int getMark() {return mark;}


    public void setMark(int newMark) {
        if (newMark > 100 || newMark < 0) {
            System.out.println("Mark should be between 0-100");
        } else {
            this.mark = newMark;
        }
    }

    public char getGrade() {
        if (mark >= 80) {
            return 'A';
        } else if (mark >= 70) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        }

        return 'F';
    }

    public static void main(String[] args) {
        Student tadiwa = new Student("Tadiwanashe");
        Student simba = new Student("Simbarashe");

        tadiwa.setMark(86);
        simba.setMark(101);

        System.out.println("Tadiwa Grade: " + tadiwa.getGrade());
    }
}

