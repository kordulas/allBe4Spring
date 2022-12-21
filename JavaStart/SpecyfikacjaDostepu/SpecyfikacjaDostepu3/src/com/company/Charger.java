package com.company;

import Model.Telephone;

public class Charger {

    public void charger(Telephone telephone){
        telephone.setChargeLevel(telephone.getChargeLevel()+1);
        System.out.println("Telefon został podładowany");
    }
}
