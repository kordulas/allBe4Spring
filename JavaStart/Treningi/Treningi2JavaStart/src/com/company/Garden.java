package com.company;

public class Garden {

    public static void main(String[] args) {

        Plant plant1 = new Plant();
        plant1.plantSpecies = "Kaktus";
        plant1.ileWodyPotrzebuje = 0.1f;

        Plant plant2 = new Plant();
        plant2.plantSpecies = "Sosna";
        plant2.ileWodyPotrzebuje = 2.0f;

        Plant plant3 = new Plant();
        plant3.plantSpecies = "Sekwoja";
        plant3.ileWodyPotrzebuje = 20f;

        System.out.println("Dzienne zuzycie wody rosli to :" + " "+ (plant1.ileWodyPotrzebuje + plant2.ileWodyPotrzebuje+ plant3.ileWodyPotrzebuje));
        System.out.println("Tygodniowe zuzycie wody rosli to :" + " "+ (plant1.ileWodyPotrzebuje + plant2.ileWodyPotrzebuje+ plant3.ileWodyPotrzebuje) * 7);
        System.out.println("Roczne zuzycie wody rosli to :" + " "+ (plant1.ileWodyPotrzebuje + plant2.ileWodyPotrzebuje+ plant3.ileWodyPotrzebuje) *365);
    }
}
class Plant{
    String plantSpecies;
    float ileWodyPotrzebuje;
}
