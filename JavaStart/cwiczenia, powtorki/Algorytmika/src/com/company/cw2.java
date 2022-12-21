package com.company;

import java.util.Scanner;

public class cw2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int multi = 1;
        int next = 0;
        System.out.println("Wprowadz piec liczb ktore chcesz pomnozyc");

        for (int i = 0; i < 5; i++) {
            next = scan.nextInt();
            multi *= next;
        }
        System.out.println(multi);
        if(multi >= 0)
            System.out.println("Liczba jest dodatnia");
        else
            System.out.println("Liczba jest ujemna");
    }
}

