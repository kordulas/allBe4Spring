package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz jedna z dwoch opcji: ");
        System.out.println("0 - orzeł");
        System.out.println("1 - reszka");
        int wybor = sc.nextInt();
        Random random = new Random();
        int losuj = random.nextInt(2);

        if(wybor == 0 && wybor == losuj)
            System.out.println("Brawo wypadł orzeł, wygrales!");
        else if (wybor == 1 && wybor == losuj)
            System.out.println("Brawo wypadla reszka, wygrales");
        else
            System.out.println("Niestety przegrales");
        sc.close();
        System.out.println(losuj);
        }
    }

