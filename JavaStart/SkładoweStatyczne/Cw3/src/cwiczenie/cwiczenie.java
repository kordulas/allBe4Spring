package cwiczenie;

import java.util.Scanner;

public class cwiczenie {
    public static void main(String[] args) {

        System.out.println("Wprowadz liczby ktore chcesz zsumowac");
        Scanner skan = new Scanner(System.in);
        int[] tab1 = new int[10];
        int suma = 0;

        for (int l = 0; l < tab1.length; l++)
            tab1[l] = skan.nextInt();

        for (int i = 0; i < tab1.length;i++)
            suma = suma + tab1[i];

        System.out.println(suma);

    }
}
