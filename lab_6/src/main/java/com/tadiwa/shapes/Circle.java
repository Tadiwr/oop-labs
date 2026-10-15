package com.tadiwa.shapes;

public class Circle extends Shape {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * this.radius * (Math.PI * Math.PI);
    }

    @Override
    public double perimeter() {
        return 2 * this.radius * Math.PI;
    }
}
