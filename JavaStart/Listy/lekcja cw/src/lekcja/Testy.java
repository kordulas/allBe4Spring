package lekcja;

import java.util.ArrayList;
import java.util.List;

public class Testy {
    public static void main(String[] args) {

        List<Double> lista1 = new ArrayList<>();
        for(int i = 0; i < 100; i++)
            lista1.add((double) i);
       // lista1.remove(45);
        System.out.println(lista1.get(99));
        System.out.println(lista1);
        int a = 5;
        zmien(a);
        boolean sprobuj = true;
        boolean avb = zamien(sprobuj);
    }

    public static void zmien(int x){
        System.out.println(x += 5);
    }
    public static boolean zamien(boolean a){
        a = false;
        return a;
    }

}
