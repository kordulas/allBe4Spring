import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        IntStream.iterate(0, n -> n + 1)
                .filter(i -> i > 100 && i < 1000 && i%5 ==0)
                .limit(10)
                .map(x -> x*3)
                .forEach(System.out::println);
    }
}
