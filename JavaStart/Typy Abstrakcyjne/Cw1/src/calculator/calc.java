package calculator;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Aby obliczyc wlasciwosci trojkata wscisnij: 1, aby obliczyc wlasciwosci prostokata wcisnij: 2");
        int wybor = skanuj.nextInt();
        switch (wybor) {
            case 1:
                System.out.println("Wprowadz dane: wysokosc, podstawa, ramie1, ramie2");
                double wysokosc = skanuj.nextInt();
                double podstawa = skanuj.nextInt();
                double ramie1 = skanuj.nextInt();
                double ramie2 = skanuj.nextInt();
                Triangle trojkat = new Triangle(wysokosc, podstawa, ramie1, ramie2);
                System.out.println("Co chcesz wyliczyc? Pole wscisnij: 1, obwod wcisnij: 2");
                int wybor1 = skanuj.nextInt();
                if (wybor1 == 1) {
                    System.out.println(trojkat.obliczPole());
                } else
                    System.out.println(trojkat.obliczObwod());
                break;
            case 2:
                System.out.println("Wprowadz dane: bok a, bok b");
                double a = skanuj.nextInt();
                double b = skanuj.nextInt();
                Rectangle prostokat = new Rectangle(a, b);
                System.out.println("Co chcesz wyliczyc? Pole wscisnij: 1, obwod wcisnij: 2");
                int wybor2 = skanuj.nextInt();
                if (wybor2 == 1) {
                    System.out.println(prostokat.obliczPole());
                } else
                    System.out.println(prostokat.obliczObwod());
                break;
        }
    }
}