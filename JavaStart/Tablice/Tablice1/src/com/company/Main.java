package com.company;

import java.util.ArrayList;

public class Main {
    public int dodajTablice(int[]a, int[]b){
        return a[0] + a[1] + a[2] + b[0] + b[1] + b[2];
    }

    public static void main(String[] args) {

        int tab1[] ={2,5,7};
        int tab2[] ={3,6,14};

        System.out.println("Suma liczb wynosi: ");
        int sum = tab1[0] + tab1[1] + tab1[2];
        System.out.println(sum);

        int suma = 0;
        for(int i = 0;i <tab1.length;i++){
            suma = suma + tab1[i];
        }
        System.out.println(suma);

        Main funkcja = new Main();
        System.out.println(funkcja.dodajTablice(tab1,tab2));

    }
}
