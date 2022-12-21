package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj liczby które chcesz zsumować");
        int suma = 0;
        int tmp = 0;
        while((tmp = skanuj.nextInt()) < 100){
            suma += tmp;
        }

        System.out.println(suma);
        if (suma%2 == 0) {
            System.out.println("Suma podanych przez Ciebie liczb jest parzysta");
        }
        else {
            System.out.println("Suma podanych przez Ciebie liczb jest nieparzysta");
        }

    }
}
