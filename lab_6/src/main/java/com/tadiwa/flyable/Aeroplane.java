package com.tadiwa.flyable;

public class Aeroplane implements Flyable {

    public String make;
    public String type;

    public Aeroplane(String make, String type) {
        this.make = make;
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println("Plane with jet engines, souring through the sky");
    }
}
