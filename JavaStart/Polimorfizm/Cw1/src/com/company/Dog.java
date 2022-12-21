package com.company;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void giveSound() {
        System.out.println("Jestem psem i nazywam sie: " + getName());
    }
}
