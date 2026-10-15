package com.tadiwa.animal;

import java.util.List;

public class AnimalDemo {
    public static void main(String[] args) {
        List<Animal> animals = List.of(
                new Cat(),
                new Cow(),
                new Duck()
        );

        animals.forEach(Animal::sound);
    }
}
