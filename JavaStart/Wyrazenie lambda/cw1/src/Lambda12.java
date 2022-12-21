import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda12 {
    public static void main(String[] args) {

        Random random = new Random();
        Supplier<List<Integer>> supplier = () ->{
            List<Integer> listaOdSuppliera = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                listaOdSuppliera.add(random.nextInt(100));
            }
            return listaOdSuppliera;
        };

        List<Integer> lista10 = supplier.get();

        Consumer<List<Integer>> consumer = list -> System.out.println(list);
        consumer.accept(lista10);
    }
}
