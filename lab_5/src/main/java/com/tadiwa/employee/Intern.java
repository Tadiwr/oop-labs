package com.tadiwa.employee;

// EXPLAIN: Intern is a type of employee
public class Intern extends Employee {
    // EXPLAIN: The number of days the intern is contracted for
    public int contractDays;

    public Intern(String name, double baseSalary, int contractDays) {
        super(name, baseSalary);
        this.contractDays = contractDays;
    }
}
