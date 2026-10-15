package com.tadiwa;

import org.w3c.dom.css.Rect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Rectangle {
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return this.height * this.width;
    }

    public int perimeter() {
        return (2 * this.width) + (2 * this.height);
    }

    public static void main(String[] args) {
        List<Rectangle> rectangles = List.of(
                new Rectangle(10, 23),
                new Rectangle(4, 5),
                new Rectangle(7, 21),
                new Rectangle(3, 9),
                new Rectangle(5, 3)
        );

        Rectangle largest = Collections.max(
                rectangles,
                Comparator.comparingInt(Rectangle::area)
        );

        System.out.println("Largest Rectangle by area");
        System.out.println("Area: " + largest.area());
        System.out.println("Width: " + largest.width);
        System.out.println("Height: " + largest.height);

        Rectangle r1 = new Rectangle(3, 5);
        Rectangle r2 = r1;

        r2.width = 7;

        System.out.println("\nR1 width is now 7, because r2 was assigned to the reference of r1");
        System.out.println("R1 Width: " + r1.width);
        System.out.println("R2 Width: " + r2.width);
    }
}
