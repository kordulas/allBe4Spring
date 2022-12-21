package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowadzic");
        int iloscLiczb = skanuj.nextInt();
        int suma = 0;
        while (iloscLiczb -->0) {
            System.out.println("Wprowadź liczby: ");
            suma = suma + skanuj.nextInt();
        }

        System.out.println(suma);
        skanuj.close();
    }
}
