package com.company;

import java.util.Scanner;

public class Intrukcje {
    char wybor;
    Scanner skaner = new Scanner(System.in);

    public void wybierzAkcje(double a, double b) {
        System.out.println("Wybierz akcje");
        wybor = skaner.next().charAt(0);
        switch (wybor) {
            case '+':
                System.out.println(a + b);
            break;
            case '-':
                System.out.println(a - b);
            break;
            case '*':
                System.out.println(a * b);
            break;
            case '/':
                System.out.println(a / b);
            break;
            default:
                System.out.println("Podany operator nie istnieje!");
        }
    }
}