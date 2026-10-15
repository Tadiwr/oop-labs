package com.tadiwa.flyable;

public class Bird implements Flyable{

    public String kind;

    public Bird(String kind) {
        this.kind = kind;
    }

    @Override
    public void fly() {
        System.out.println("Bird flapping its wings, flying up in the sky");
    }
}
