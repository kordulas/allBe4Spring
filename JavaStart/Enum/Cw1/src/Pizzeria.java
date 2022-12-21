import Cw1.Pizza;

import java.util.Locale;
import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);
        System.out.println("Witaj w pizzeri, oto lista dostępnych pozycji: ");
        Pizza[] tab1 = Pizza.values();
        for(Pizza abc : tab1) {
            System.out.println(abc);
        }
        System.out.println("Ktora pizze chcialbys zamowic?");
        String wybor = skan.nextLine().toUpperCase(Locale.ROOT);
        Pizza pizza = Pizza.valueOf(wybor);
        System.out.println("Przyjeto zamownienie na: " + pizza);
        skan.close();
    }
}
