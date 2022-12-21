package com.company;

public class Main {

    public static void main(String[] args) {

        double [][] tab1 = {{1.0, 1.5, 2.0},
                           {1.5, 2.0, 2.5},
                           {2.0, 2.5, 3.0}};
        System.out.println(tab1[0][0]* tab1[1][1]*tab1[2][2]);
        System.out.println((tab1[1][0]+tab1[1][1]+tab1[1][2])*(tab1[0][1]+tab1[1][1]+tab1[2][1]));
        System.out.println(tab1[0][0]+tab1[0][1]+tab1[0][2]+tab1[1][0]
        +tab1[1][2]+tab1[2][0]+tab1[2][1]+tab1[2][2]);
    }
}
