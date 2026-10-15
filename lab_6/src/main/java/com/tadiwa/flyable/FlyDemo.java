package com.tadiwa.flyable;

import java.util.List;

public class FlyDemo {

    public static void flySomething(Flyable flyable) {
        flyable.fly();
    }

    public static void main(String[] args) {
        Bird bird = new Bird("Eagle");
        Aeroplane plane = new Aeroplane("Airbus", "Commercial");

        flySomething(bird);
        flySomething(plane);
    }

}
