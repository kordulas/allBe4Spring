import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        boolean check = courses.anyMatch(course -> course.getPrice() > 100);

        int[] liczby = IntStream.rangeClosed(0, 10).toArray();
        List<Integer> kolekcja = IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());

        String abc = "Jakub";
        int sum = abc.chars()
                .sum();
        System.out.println(sum);
    }
}