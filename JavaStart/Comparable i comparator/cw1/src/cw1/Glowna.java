package cw1;

import java.util.Arrays;
import java.util.Comparator;

public class Glowna {
    public static void main(String[] args) {

        Integer[] tab1 = {2,3,56,123,4,2,234,65,34,67,123,47,436,243,75,1324,5436,875,124,543};
        System.out.println(Arrays.toString(tab1));

        Arrays.sort(tab1);
        System.out.println(Arrays.toString(tab1));

        Arrays.sort(tab1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -Integer.compare(o1,o2);
            }
        });
        System.out.println(Arrays.toString(tab1));
    }
}
