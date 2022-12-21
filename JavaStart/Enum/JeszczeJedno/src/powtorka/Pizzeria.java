package powtorka;

import java.security.PublicKey;
import java.util.Locale;
import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);
        Pizza[] tab1 = Pizza.values();
        System.out.println("Dostepne w karcie pizze to: ");
        for(Pizza abc: tab1) {
            System.out.println(abc);
        }
        System.out.println("Ktora pizze chcesz zamowic?");
        String wybor = skan.nextLine().toUpperCase(Locale.ROOT);
        Pizza pizza = Pizza.valueOf(wybor);
        System.out.println("Przyjeto zamowienie na: " + pizza);

    }
}
