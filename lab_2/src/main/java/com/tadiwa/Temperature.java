package com.tadiwa;

public class Temperature {
    public double degrees;

    private Temperature(double degrees) {
        this.degrees = degrees;
    }

    public static Temperature fromCelsius(double degrees) {
        return new Temperature(degrees);
    }

    public static Temperature fromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        return new Temperature(celsius);
    }

    public void display() {
        System.out.println(this.degrees + " Degrees Celsius");
    }

    public static void main(String[] args) {
        Temperature reading1 = Temperature.fromCelsius(32);
        Temperature reading2 = Temperature.fromFahrenheit(32);

        reading1.display();
        reading2.display();

        System.out.println("Static factories are clearer than overloaded constructors because\nit may be difficult to tell what the meaning of each constructor is when they are many");
    }
}
