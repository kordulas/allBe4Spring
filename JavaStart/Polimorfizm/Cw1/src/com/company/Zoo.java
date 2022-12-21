package com.company;

public class Zoo {

    public static void main(String[] args) {

        Animal animal = new Animal("Kotopies");
        Animal dog = new Animal("Leo");
        Animal cat = new Cat("Mruczek");

        animal.giveSound();
        dog.giveSound();
        cat.giveSound();

        ((Cat)cat).meow();

    }
}
