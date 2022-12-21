package com.company;

public class Fruit {

    public String Type;
    public double weight;

    public Fruit(String Type, double weight) {
        this.Type = Type;
        this.weight = weight;
    }

    public String getInfo(){
        return "Owoc: "+ Type + " o wadze: " + weight;
    }
}
