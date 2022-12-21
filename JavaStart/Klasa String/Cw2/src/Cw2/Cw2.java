package Cw2;

import java.util.Locale;
import java.util.Scanner;

public class Cw2 {
    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj dowolony wyraz: ");
        String wyraz = skanuj.nextLine();

        Character litera = (wyraz.charAt(0));
        if(Character.isUpperCase(litera)){
            System.out.println(wyraz.toUpperCase(Locale.ROOT));
        }
        else if(Character.isLowerCase(litera)) {
            System.out.println(wyraz.toLowerCase(Locale.ROOT));
        }
        else
            System.out.println(wyraz);

    }
}
