package com.company;

import java.util.Random;

public class Main {

    public static int licz(int x) {
        if (x / 1000 !=0) {
            return x;
        }else if(x / 100 !=0) {
            System.out.println("Uzupelniono do czterech liczb");
            return x *10;
        }else if (x /10 !=0) {
            System.out.println("Uzupelniono do czterech liczb");
            return x * 100;
        }else if(x == 0)
            return 0;
        else
            return x *1000;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(10);

        if( x < 5000){
            System.out.println("Wylosowana liczba jest mniejsza niż 5000");
        }else if(x == 5000){
            System.out.println("Wylosowana liczba jest równa 5000");
        }else
            System.out.println("Wylosowana liczba jest większa niż 5000");

        int b = x%2;

        switch (b){
            case 0:
                System.out.println("Liczba patzysta");
                break;
            case 1:
                System.out.println("Liczba nieparzysta");
                break;
        }
        System.out.println(licz(x));
        System.out.println(x);

    }
}
