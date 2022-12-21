import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> imiona = Arrays.asList("Kasia", "asia", "Karol", "Anita", "Monika", "basia");

        imiona.sort(String::compareToIgnoreCase);

//        Collections.sort(imiona, (o1, o2) -> o1.compareToIgnoreCase(o2));


//        Collections.sort(imiona, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

//        for (String s : imiona) {
//            System.out.println(s);
//        }

        imiona.forEach(System.out::println);
    }
}
