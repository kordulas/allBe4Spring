package cw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listy2 {
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);
        List<Integer> lista1 = new ArrayList<>();
        boolean isCorrect = true;

        while (isCorrect){
            System.out.println("Podaj kolejna liczne nieujemna, podzielna przez 5");
            int temp = skan.nextInt();
            if(temp >= 0 && temp%5 == 0){
                lista1.add(temp);
            }else
                isCorrect = false;
        }

        int suma = 0;
        for(int liczby : lista1){
            suma = suma + liczby;
        }

        int avg = suma / lista1.size();
        System.out.println("Ile poprawnych liczby: " + lista1.size());
        System.out.println("Suma liczb wynosi: " + suma);
        System.out.println("Natomiast ich srednia to: " + avg);
    }
}
