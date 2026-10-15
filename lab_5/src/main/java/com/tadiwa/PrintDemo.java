package com.tadiwa;

import java.util.Arrays;

public class PrintDemo {
    public static void print(int val) {
        System.out.println(val);
    }

    public static void print(double val) {
        System.out.println(val);
    }

    public static void print(String val) {
        System.out.println(val);
    }

    public static void print(int[] val) {
        StringBuilder stringBuilder = new StringBuilder("[ ");

        Arrays.stream(val)
                .forEach(intVal -> {
                    stringBuilder.append(intVal).append(" ");
                });

        stringBuilder.append("];");

        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
        // Expect 12
        PrintDemo.print(12);

        // Expect 15.75
        PrintDemo.print(15.75);

        // Expect Hello
        PrintDemo.print("Hello");

        // Expect [ 1 2 3 4 5 ];
        PrintDemo.print(new int[]{1, 2, 3, 4, 5});
    }
}
