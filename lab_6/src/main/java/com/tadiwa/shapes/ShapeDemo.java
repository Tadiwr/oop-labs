package com.tadiwa.shapes;

import java.util.List;

public class ShapeDemo {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(4),
                new Rectangle(5, 7),
                new Square(5)
        );

        shapes.forEach(shape -> {
            System.out.println("-------------------------------------------");
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println("-------------------------------------------");
        });
    }
}
