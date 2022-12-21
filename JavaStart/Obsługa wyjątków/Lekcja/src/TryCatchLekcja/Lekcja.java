package TryCatchLekcja;

import java.util.Scanner;

public class Lekcja {
    static Scanner skanuj = new Scanner(System.in);
    public static void main(String[] args) {

        try {
            System.out.println(kalkulacja());
        }
        catch (UnknowOperatorException | ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    public static double kalkulacja(){
        double result = 0;
        double a = 0;
        double b = 0;
        System.out.println("Wprowadz pierwsza libczbe");
        a =skanuj.nextInt();
        System.out.println("Wprowadz kolejna liczbe");
        b = skanuj.nextInt();
        skanuj.nextLine();
        System.out.println("Jakie dzialanie chcesz wykonac, wprowadz odpowiedni symbol");
        String[] tab1 = {"+","-","*","/"};
        for(String abc : tab1){
            System.out.print(abc + " ");
        }
        System.out.println(" ");
        String wybor = skanuj.nextLine();
        if(wybor.equals("+"))
            result = dodawanie(a,b);
        else if(wybor.equals("-"))
            result = odejmowanie(a,b);
        else if(wybor.equals("*"))
            result = mnozenie(a,b);
        else if (wybor.equals("/"))
            result = dzielenie(a,b);
        else
            throw new UnknowOperatorException("Zły operator!!!");
        return result;
    }

    public static double dodawanie(double a, double b){
        return a+b;
    }
    public static double odejmowanie(double a, double b){
        return a-b;
    }
    public static double mnozenie(double a, double b){
        return a*b;
    }
    public static double dzielenie(double a, double b){
        if( b == 0 )
            throw new ArithmeticException("Nie dziel przez zero!!!!");
        return a/b;
    }

}
