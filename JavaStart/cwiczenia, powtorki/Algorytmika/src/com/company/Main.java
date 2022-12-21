package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Wprowadz liczby ktore chcesz dodac");
        int suma = 0;
        int nastepna;

        while((nastepna = skanuj.nextInt()) <= 100){
            suma = suma + nastepna;
        }
        System.out.println(suma);

        if(suma %2 == 0)
            System.out.println("Suma liczb jest parzysta");
        else
            System.out.println("Suma liczb jest nieparzysta");
    }
}
