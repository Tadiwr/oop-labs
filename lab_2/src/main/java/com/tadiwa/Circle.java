package com.tadiwa;

import java.util.List;

public class Circle {
    public double radius;

    public static int counter = 0;

    public Circle(double radius) {
        counter += 1;
        this.radius = radius;
    }

    public Circle() {
        counter += 1;
        this.radius = 1.0;
    }

    public void display() {
        System.out.println("Circle Radius: " + this.radius);
    }

    public static int getCount() {
        return counter;
    }

    public static void main(String[] args) {
        List<Circle> circles = List.of(
                new Circle(5),
                new Circle()
        );

        circles.forEach(Circle::display);
        System.out.println("Number of Circles: " + Circle.counter);
    }
}
