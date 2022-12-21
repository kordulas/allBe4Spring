import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoremIpsum {
    public static void main(String[] args) {

        final String FILE_NAME = "data.txt";
        try {
            List<String> words = readWords(FILE_NAME);
            System.out.println(words);
            System.out.println("--------");
            showAttributes(words);
        } catch (IOException e) {
            System.err.println("Błąd odczytu lub brak pliku!!" + FILE_NAME);
        }
    }

    private static void showAttributes(List<String> words) {
        long s1 = words.stream()
                .filter(s -> s.startsWith("s"))
                .count();
        System.out.println("Liczba wyrazów rozpoczymających sie od litery 's' to: " + s1);

        long count = words.stream()
                .filter(s -> s.length() == 5)
                .count();
        System.out.println("Liczba wyrazów majacych 5 liter wynosi: " + count);
    }

    private static List<String> readWords(String filename) throws IOException {
        try (var reader = new BufferedReader(new FileReader(filename))) {
            List<String> words = new ArrayList<>();
            return reader.lines()
                    .map(line -> line.split(" "))
                    .flatMap(Arrays::stream)
                    .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                    .collect(Collectors.toList());
        }
    }
}