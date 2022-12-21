package Cw1;

import java.util.Scanner;

public class StringBuil {

    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Ile wyrazow chcesz wprowadzic?");
        int ile = skanuj.nextInt();
        String[] tab1 = new String[ile];
        skanuj.nextLine();
        System.out.println("Wprowadz teraz "+ ile + " wyrazy");
        for (int i = 0; i < tab1.length;i++) {
            tab1[i] = skanuj.nextLine();
        }
        StringBuilder s1 = new StringBuilder();
        for(int i =0; i < tab1.length;i++){
        s1.append(tab1[i].charAt(tab1[i].length()-1));
        }
        System.out.println(s1.toString());
        skanuj.close();
    }
}
