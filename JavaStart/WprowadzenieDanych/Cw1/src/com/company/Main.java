package com.company;


import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        skanuj.useLocale(Locale.US);
        System.out.println("Wprowadz pierwsza liczbe");
        double a = skanuj.nextInt();
        System.out.println("Wprowadz druga liczbe");
        double b = skanuj.nextInt();

        Intrukcje intrukcje = new Intrukcje();
        intrukcje.wybierzAkcje(a,b);
        skanuj.close();
    }
}
