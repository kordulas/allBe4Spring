package cwiczenie1;

import java.util.*;

public class PersonApp {
    public static void main(String[] args) {

        Map<String,Person> personMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        personMap.put("Kowalski", new Person("Adam","Kowalski",20));
        personMap.put("Sobczak", new Person("Rafał","Sobczak",21));
        personMap.put("Mierkiewicz", new Person("Michał","Mierkiewicz",24));
        personMap.put("Nowak", new Person("Adam","Nowak",25));
        personMap.put("Kisiel", new Person("Anna","Kisiel",15));
        personMap.put("Kowal", new Person("Jakub","Kowal",16));
        personMap.put("Mikiciuk", new Person("Bartosz","Mikiciuk",22));
        personMap.put("Kordulas", new Person("Patryk","Kordulas",28));
        personMap.put("Wojnicz", new Person("Miłosz","Wojnicz",27));
        personMap.put("Adamiak", new Person("Janusz","Adamiak",29));

        Collection<Person> persons = personMap.values();
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
