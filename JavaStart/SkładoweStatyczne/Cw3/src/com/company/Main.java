package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(10, true, false, false, false);
        System.out.println("Uruchomienie samochodu z paliwem, sprawnym silnikiem i wszystkim zamkniętym");
        car.start();
        System.out.println(car.status());
        System.out.println();

        System.out.println("Otwarcie drzwi");
        car.setDoorsAndTrunkOpen(true);
        System.out.println(car.status());
        System.out.println();

        System.out.println("Kończy się paliwo");
        car.setFuelLvl(0);
        System.out.println(car.status());
    }
}
