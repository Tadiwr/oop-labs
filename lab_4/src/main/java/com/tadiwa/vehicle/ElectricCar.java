package com.tadiwa.vehicle;

public class ElectricCar extends Car {
    public int batteryCapacity;

    public ElectricCar(String manufacturer, String carType, int batteryCapacity) {
        super(manufacturer, carType);
        this.batteryCapacity = batteryCapacity;
        System.out.println("ElectricCar constructor called");
    }
}
