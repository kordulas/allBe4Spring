package com.company;

public class Online extends Kurs{

    public int courseLength;
    public int timeToDo;

    @Override
    public void printInfo() {
        System.out.println(getAboutKurs() + " |" + getIdKurs() +" |"
                + getKursName() +" |" + getPrice()
                + " |" + courseLength + " |" + timeToDo);
    }
}
