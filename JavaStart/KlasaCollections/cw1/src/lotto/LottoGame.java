package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
    public static void main(String[] args) {

        System.out.println("Witamy w losowaniu Lotto!");
        List<Integer> userNumbers = readNumbersFromUser();
        Lotto gra = new Lotto();
        int wynik = gra.checkResults(userNumbers);
        System.out.println("Trafiłeś: " + wynik + " , z 49 liczb!");
        System.out.println(userNumbers);
        System.out.println(gra.getResults());
    }

    private static List<Integer> readNumbersFromUser() {
        List<Integer> userNumbers = new ArrayList<>();
        Scanner skanuj = new Scanner(System.in);
        for (int i = 0; i < Lotto.MAX_NUMBERS ; i++) {
            System.out.println("Podaj kolejna liczbę:");
            int nextN = skanuj.nextInt();
            if(nextN < Lotto.NO_OF_NUMBERS && nextN > 0) {
                userNumbers.add(nextN);
            }else {
                System.err.println("Podaj liczbe z zakresu 1-49!!");
                i--;
            }
        }
        return userNumbers;
    }
}
