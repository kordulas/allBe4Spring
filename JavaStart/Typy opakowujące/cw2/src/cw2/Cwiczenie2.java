package cw2;

import java.util.Scanner;

public class Cwiczenie2 {
    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj dowolny tekst z literami i cyframi: ");
        String abc = skanuj.nextLine();

        System.out.println("Liczba cyfr w tekscie: " + countDigits(abc));
        System.out.println("Liczba liter w tekscie: " + countLetters(abc));
        System.out.println("Najwieksza cyfra w tekscie: " + biggestNumber(abc));
    }

    private static int biggestNumber(String abc) {
        final int notfound = -1;
        int biggestNumber = notfound;
        for (int i = 0; i < abc.length(); i++) {
            if (Character.isDigit(abc.charAt(i))) {
                int temp = Character.getNumericValue(abc.charAt(i));
                biggestNumber = Integer.max(biggestNumber,temp);
            }
        }
        if (biggestNumber == notfound)
            throw new DigitNotFoundException("W podanym tekscie nie ma cyfr!!");
        return biggestNumber;
    }
    private static int countLetters(String abc) {
        int counter = 0;
        for(int i = 0; i < abc.length();i++){
            if(Character.isLetter(abc.charAt(i)))
                counter++;
        }
        return counter;
    }

    private static int countDigits(String abc) {
        int counter = 0;
        for(int i = 0; i < abc.length();i++){
            if(Character.isDigit(abc.charAt(i)))
                counter++;
        }
        return counter;
    }
}
