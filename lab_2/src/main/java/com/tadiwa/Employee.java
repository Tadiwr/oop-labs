package com.tadiwa;

import java.util.List;

public class Employee {
    private static int counter = 1;

    public final int employeeId;
    public String fullName;
    public String department;

    public Employee() {
        this.employeeId = counter;
        this.fullName = "No Name";
        this.department = "No Department";

        counter += 1;
    }

    public Employee(String fullName) {
        this.employeeId = counter;
        this.fullName = fullName;
        this.department = "No Department";

        counter += 1;
    }

    public Employee(String fullName, String department) {
        this.employeeId = counter;
        this.fullName = fullName;
        this.department = department;

        counter += 1;
    }

    public Employee(Employee employee) {
        this.employeeId = employee.employeeId;
        this.fullName = employee.fullName;
        this.department = employee.department;
    }


    public void display() {
        System.out.println("\n--------------------------------");
        System.out.println("Employee Id: " + this.employeeId);
        System.out.println("Full Name: " + this.fullName);
        System.out.println("Department: " + this.department);
        System.out.println("--------------------------------\n");
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(),
                new Employee("Tadiwanashe Shangwa"),
                new Employee("James Maputi", "Finance")
        );

        employees.forEach(Employee::display);
    }
}
