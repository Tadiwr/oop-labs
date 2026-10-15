package com.tadiwa.vehicle;

public class Car extends Vehicle {

    public String carType;

    public Car(String manufacturer, String carType) {
        super(manufacturer);
        this.carType = carType;
        System.out.println("Car constructor called");
    }

}
