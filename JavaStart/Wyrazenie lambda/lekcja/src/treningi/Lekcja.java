package treningi;

import java.util.Locale;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lekcja {
    public static void main(String[] args) {

        String pierwszy = "   Jakub    ";
        System.out.println(pierwszy);
        Function<String, String> function = s -> s.toLowerCase(Locale.ROOT).trim();
        String zmieniony = function.apply(pierwszy);
        System.out.println(zmieniony);

        System.out.println("--------------");

        Consumer<String> consumer = s -> {
            System.out.println(s.trim());
            System.out.println(s);
            System.out.println(s);
        };
        String drugi = " Kanonierzy ";
        consumer.accept(drugi);

        System.out.println("---------------");
        int age = 20;
        Predicate<Integer> isAdult = wiek -> wiek>=18;
        boolean check = isAdult.test(age);
        if(check){
            System.out.println("Jestes pelnoletni");
        }else
            System.out.println("Na to jeszcze przyjdzie pora!");

        System.out.println("--------------");

        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej", "Mikołaj", "Bartosz", "Marcin"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski","Kowalski","Bielecki", "Krychowiak"};
        int[] ages = {22, 33, 44, 55, 23, 24, 26, 25, 30};

        Random random = new Random();
        Supplier<Person> personGenerator = () -> {
            String imie = firstNames[random.nextInt(firstNames.length)];
            String nazwisko = lastNames[random.nextInt(lastNames.length)];
            int wiek = ages[random.nextInt(ages.length)];
            return new Person(imie, nazwisko, wiek);
        };
        Person pierwsza = personGenerator.get();
        System.out.println(pierwsza);

    }
}
