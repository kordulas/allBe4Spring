import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda1 {
    public static void main(String[] args) {

        List<Integer> listaZLiczbami = new ArrayList<>();
        Random random = new Random();
        generate(listaZLiczbami,10,() -> random.nextInt(1000));
        System.out.println(listaZLiczbami);
        System.out.println("-------------------");

        //Consumer <Integer> consumer = x -> System.out.print(x + " ");
        wyswietl(listaZLiczbami,x -> System.out.print(x + " "));

        System.out.println(" ");
        System.out.println("----------");
        usunLiczbyPodzielnePrzez2(listaZLiczbami, liczba -> liczba%2 ==0);
        wyswietl(listaZLiczbami,x -> System.out.print(x + " "));

    }

    private static <T> void generate(List<T> lista, int howManyNumbers, Supplier<T> sup){
        for (int i = 0; i < howManyNumbers; i++) {
            lista.add(sup.get());
        }
    }

    private static <T> void wyswietl(List<T> list, Consumer<T> cons){
        for (T t : list) {
            cons.accept(t);
        }
    }

    private static<T> void usunLiczbyPodzielnePrzez2(List<T> lista, Predicate<T> predicate) {
        lista.removeIf(predicate);
    }
}
