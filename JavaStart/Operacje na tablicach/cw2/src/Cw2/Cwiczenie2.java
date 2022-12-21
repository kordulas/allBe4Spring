package Cw2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Cwiczenie2 {
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);
        System.out.println("Wprowadz pierwsze slowo: ");
        String jeden = skan.nextLine();
        System.out.println("Podaj drugie slowo:");
        String drugi = skan.nextLine();
        skan.close();
        sameWords(jeden,drugi);

    }

    public static void sameWords(String pierwszy, String drugi){
        if(pierwszy.length() != drugi.length())
            System.out.println("Wyrazy są różne");
        char[] array =pierwszy.toLowerCase(Locale.ROOT).toCharArray();
        char[] array2 =drugi.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(array);
        Arrays.sort(array2);
        if(Arrays.equals(array, array2))
            System.out.println("Wyrazy skladaja sie z tych samych liter");
        else
            System.out.println("Wyrazy sa inne.");
    }
}
