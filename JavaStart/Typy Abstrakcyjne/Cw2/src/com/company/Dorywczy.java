package com.company;

public class Dorywczy extends  Pracownik{

    private final double stawkaGodzinowa = 80;
    private final double przepracowaneGodziny = 20;

    public Dorywczy(String name, String lastName) {
        super(name, lastName);
    }

    public double getWyplata(){
        return stawkaGodzinowa * przepracowaneGodziny;
    }

    @Override
    public double obliczPensje() {
        return getWyplata() *12;
    }

    @Override
    public String toString() {
        return getName() + " " + getLastName() + ": wypłata miesięczna: " + getWyplata() +  " ,wypłata roczna: " + obliczPensje();
    }
}
