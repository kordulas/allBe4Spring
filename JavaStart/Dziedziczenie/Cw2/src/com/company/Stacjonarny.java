package com.company;

public class Stacjonarny extends Kurs{

    public String lokalizacjaKursu;
    public int hours;

    @Override
    public void printInfo() {
        System.out.println(getAboutKurs() + " |" + getIdKurs() +" |"
                + getKursName() +" |" + getPrice()
                + " |" + lokalizacjaKursu + " |"+ hours);
    }
}
