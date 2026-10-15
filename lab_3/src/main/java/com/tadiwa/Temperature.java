package com.tadiwa;

public class Temperature {
    private final double kelvins;

    public Temperature(double kelvins) {
        this.kelvins = kelvins;
    }

    public double getCelsius() {
        final double ONE_CELSIUS_IN_KELVINS = 273.15;
        return this.kelvins - ONE_CELSIUS_IN_KELVINS;
    }

    public double getFahrenheit() {
        return ((33.8 * this.getCelsius()) * 9/5) + 32;
    }

    public static void main(String[] args) {
        Temperature reading1 = new Temperature(292.15);

        System.out.println("--------------------------------------------------");
        System.out.println("Degrees Celsius: " + reading1.getCelsius());
        System.out.println("Degrees Fahrenheit: " + reading1.getFahrenheit());

        System.out.println("Changing the internal unit would break callers because the\nimplementation of getCelsius formula is based on conversion of kelvins to Celsius");

    }

}
