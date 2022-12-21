package com.company;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {

        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a>b);
        System.out.println((a*a)>b);
        System.out.println(b<a+3 && b>a-2);
        System.out.println((a*b)%2==0);
    }
}
