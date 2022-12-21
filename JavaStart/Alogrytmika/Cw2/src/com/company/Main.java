package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int multi = 1;
        int next = 0;
        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj 5 liczb ktore pomnozysz");
        for (int i = 0; i < 5; i++) {
            next = skanuj.nextInt();
            multi *= next;

        }
        System.out.println(multi);
        if ( multi >=0){
            System.out.println("Nieujemna");
        }else
            System.out.println("Ujemna");
    }
}
