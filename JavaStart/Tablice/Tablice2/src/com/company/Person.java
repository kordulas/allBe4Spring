package com.company;

public class Person {
    private int id = 0;
    private int weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public Person(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }
}
