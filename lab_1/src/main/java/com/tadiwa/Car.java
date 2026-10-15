package com.tadiwa;

import java.time.LocalDateTime;
import java.util.List;

public class Car {
    private final String brand;
    private final int year;
    private final int millage;

    public Car(String brand, int year, int millage) {
        this.brand = brand;
        this.year = year;
        this.millage = millage;
    }

    public void display() {
        System.out.println("--------------------------------------------");
        System.out.println("Car Mode: " + this.brand);
        System.out.println("Year: " + this.year);
        System.out.println("Millage " + this.millage + "km");
        System.out.println("Is Antique: " + this.isAntique());
    }

    public boolean isAntique() {
        LocalDateTime now = LocalDateTime.now();
        int yearToday = now.getYear();
        int age = yearToday - this.year;

        return age > 25;
    }

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Mercedes", 1994, 150_200),
                new Car("Toyota", 2026, 500),
                new Car("Land Rover", 2005, 35_000)
        );

        cars.forEach(Car::display);
    }
}
