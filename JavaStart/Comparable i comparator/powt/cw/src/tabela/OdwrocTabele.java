package tabela;


import java.util.Arrays;
import java.util.Comparator;

public class OdwrocTabele {
    public static void main(String[] args) {

        Integer[] tab1 = {123,13,32,643,74,23,213,364,6,457,324,283,25,458,685,12434,1};

        System.out.println(Arrays.toString(tab1));
        Arrays.sort(tab1);
        System.out.println(Arrays.toString(tab1));

        Arrays.sort(tab1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(tab1));
    }
}
