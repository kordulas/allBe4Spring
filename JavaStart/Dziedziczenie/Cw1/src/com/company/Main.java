package com.company;

public class Main {

    public static void main(String[] args) {

        Tires yokohama = new Tires(111,"Yokohama","Advan","Aaa0000",21, 325);
        yokohama.printInfo();

        ExthausPart armyTrix = new ExthausPart(999,"ArmyTrix","F458","T12-3B",false);
        armyTrix.printInfo();
    }
}
