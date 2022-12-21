package sety;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class Zapis {
    public static void main(String[] args) {

        final String FILENAME = "testy1.txt";
        TreeSet<String> dzefko = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        dzefko.add("Jakub");
        dzefko.add("Anna");
        dzefko.add("Martyna");
        dzefko.add("Michalak");
        dzefko.add("FerrariF40");

        System.out.println(dzefko);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))){
            for(String abc : dzefko){
                bw.write(abc);
                bw.newLine();
            }
        }catch (IOException e){
            System.err.println("Nieudawny zapis do pliku" + FILENAME);
        }
    }
}
