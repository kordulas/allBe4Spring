package Lekcja;

import java.util.Scanner;

public class Lekcja {

    public static void main(String[] args) {

        String s1 = new String("Anna");
        String s2 = new String("Anna");
        Scanner skanuj = new Scanner(System.in);
        String acs = skanuj.nextLine();
        System.out.println(acs.length());
        System.out.println(s1.equals(s2));
    }
}
