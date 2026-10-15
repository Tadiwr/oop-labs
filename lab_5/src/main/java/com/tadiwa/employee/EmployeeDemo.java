package com.tadiwa.employee;

import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Manager("Mr Brooks", 3_000, 1_000),
                new Developer("Derick Rose", 1_500, 50),
                new Intern("Tadiwanashe Shangwa", 500, 30),
                new Employee("Terry James", 1_000)
        );

        double totalPayrol = 0;

        for (Employee employee : employees) {
            totalPayrol += employee.calculatePay();
        }

        System.out.println("Total Payroll: " + totalPayrol);
    }
}
