package com.company;

public class Main {

    public static void main(String[] args) {

        Apple jablko = new Apple(125,"szampion");
        System.out.println(jablko.getInfo());

        Sliwka sliwka = new Sliwka("Sliwka",80,"Morela");
        System.out.println(sliwka.getInfo());
    }
}
