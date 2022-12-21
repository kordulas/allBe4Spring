package cw1Listy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListyCw1 {
    private static Scanner skanuj = new Scanner(System.in);
    private static final String EXIT = "exit";
    public static void main(String[] args) {

        List<Double> numbers = new ArrayList<>();
        fillLista(numbers);
        printLista(numbers);
    }

    private static void printLista(List<Double> numbers) {
        if (!numbers.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            double suma = 0;
            for(Double liczby : numbers){
                sb.append(liczby);
                sb.append(" + ");
                suma = suma + liczby;
            }
            sb.replace(sb.length()-1,sb.length(),"=");
            sb.append(suma);
            System.out.println(sb.toString());
        }
    }
    private static void fillLista(List<Double> numbers) {
        System.out.println("Podaj liczbe lub wpisz exit!");
        String input = skanuj.nextLine();
        if(input.toLowerCase(Locale.ROOT).equals(EXIT)){
            return;
        }
        try{
            Double temp = Double.valueOf(input);
            numbers.add(temp);
        }catch (NumberFormatException e){
            System.err.println("Podaj liczbe lub wyjdz komenda exit!");
        }
        fillLista(numbers);
    }
}