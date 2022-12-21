package com.company;

public class Etatowy extends Pracownik{

    private static final double WYPLATA = 5000;

    public double getWyplata() {
        return WYPLATA;
    }
    public double getRocznaWyplata(){
        return WYPLATA *12;
    }

    public Etatowy(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public double obliczPensje() {
        return getRocznaWyplata() + (getRocznaWyplata() * 0.05);
    }

    @Override
    public String toString() {
        return getName() + " " + getLastName() + ": wypłata miesięczna: " + WYPLATA + " ,wyplata roczna plus bonus: " + obliczPensje();
    }
}
