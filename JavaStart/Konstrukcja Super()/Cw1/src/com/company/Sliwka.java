package com.company;

public class Sliwka extends Fruit {

    public String typ;

    public Sliwka(String Type, double weight, String typ) {
        super(Type, weight);
        this.typ = typ;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " typu: " + typ;
    }
}
