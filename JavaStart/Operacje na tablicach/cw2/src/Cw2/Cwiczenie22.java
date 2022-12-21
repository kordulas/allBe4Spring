package Cw2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Cwiczenie22 {
    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Wprowadz pierwszy wyraz");
        String pierwszy = skanuj.nextLine();
        System.out.println("Wprowadz drugi wyraz");
        String drugi = skanuj.nextLine();
        boolean compareToo = copareTo(pierwszy,drugi);
        if(compareToo){
            System.out.println("Napis sklada sie z tych samych liter");
        }else {
            System.out.println("Napis sklada sie z roznych liter");
        }
    }

    private static boolean copareTo(String pierwszy, String drugi) {
        if(pierwszy == null || drugi == null || pierwszy.length() != drugi.length())
            return false;
        char[] pierwsza = pierwszy.toLowerCase(Locale.ROOT).toCharArray();
        char[] druga = drugi.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(pierwsza);
        Arrays.sort(druga);
        return Arrays.equals(pierwsza,druga);
    }
}
