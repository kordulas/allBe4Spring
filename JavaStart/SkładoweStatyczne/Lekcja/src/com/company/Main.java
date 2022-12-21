package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Car audi = new Car(5,true,true,true,false);
        //audi.setEngineRunning(true);
        //System.out.println(audi.isEngineRunning());
        System.out.println(Car.status(audi));
        System.out.println(audi.start());

    }
}
