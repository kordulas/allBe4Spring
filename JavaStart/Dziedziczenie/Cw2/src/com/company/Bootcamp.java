package com.company;

public class Bootcamp extends Stacjonarny{

    public String nameTeacher;
    public String lastNameTeacher;
    public int hoursConsult;

    @Override
    public void printInfo() {
        System.out.println(getAboutKurs() + " |" + getIdKurs() +" |"
                + getKursName() +" |" + getPrice()
                + " |" + lokalizacjaKursu + " |"+ hours
                + " |" + nameTeacher + " |" + lastNameTeacher + " |"
                + hoursConsult);
    }
}
