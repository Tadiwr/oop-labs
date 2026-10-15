package com.tadiwa;

public class Person {
    public String fullName;
    public Address address;

    public Person(String fullName, Address address) {
        this.fullName = fullName;
        this.address = address;
    }

    public static void main(String[] args) {
        Person tadiwa = new Person(
                "Tadiwa",
                new Address(123, "Bunton Road", "Harare")
        );

        Person simba = new Person("Simba", null);

        System.out.println("------------------- Tadiwa -------------------");
        System.out.println("City: " + tadiwa.address.city);

        System.out.println("\n------------------- Simba -------------------");
        System.out.println("Simba's address is null no NullPointerException should be thrown");
        System.out.println("City: " + simba.address.city);
    }
}
