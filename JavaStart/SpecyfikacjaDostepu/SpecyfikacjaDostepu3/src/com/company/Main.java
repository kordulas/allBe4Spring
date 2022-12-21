package com.company;

import Model.Telephone;

public class Main {

    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone);
        Charger charger = new Charger();
        charger.charger(telephone);
        System.out.println(telephone.getChargeLevel());
        System.out.println(telephone);
    }

}

