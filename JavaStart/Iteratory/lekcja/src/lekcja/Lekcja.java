package lekcja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lekcja {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Kasia");
        names.add("Basia");
        names.add("Basia");
        names.add("Karol");
        names.add("Monika");
        names.add("Monika");
        names.add("Monika");
        names.add("Kuba");
        names.add("Kuba");

        Iterator<String> iter = names.iterator();
        while (iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
            if(name.equals("Basia")){
               iter.remove();
             }
        }
        System.out.println("------------");
        System.out.println(names);

    }
}
