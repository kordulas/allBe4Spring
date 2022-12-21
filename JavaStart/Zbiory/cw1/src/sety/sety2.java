package sety;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class sety2 {
    public static void main(String[] args) {
        final String FILE_NAME = "namespl.txt";

        TreeSet<String> drzewko = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String newLine;
            while ((newLine = br.readLine()) != null)
                drzewko.add(newLine);
            System.out.println("Liczba unikalnych imion w zbiorze: " + drzewko.size());
            System.out.println("Pierwsze imię: " + drzewko.first());
            System.out.println("Ostatnie imię: " + drzewko.last());

        } catch (IOException fileNotFoundException) {
            System.err.println("Blad odczytu pliku");
        }
    }
}