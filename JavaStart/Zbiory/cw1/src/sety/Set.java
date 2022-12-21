package sety;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Set {

    public static void main(String[] args) {
        final String  FileName = "namespl.txt";
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        try
            (Scanner skanuj = new Scanner(new File(FileName))){
            while (skanuj.hasNextLine()){
                treeSet.add(skanuj.nextLine());
            }
            System.out.println("Liczba imion w zbiorze: " + treeSet.size());
            System.out.println("Pierwsze imię: " + treeSet.first());
            System.out.println("Ostatnie imię: " + treeSet.last());
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku: " + FileName);
        }

    }
}
