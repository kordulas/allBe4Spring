package cw1;

public class Zadanie1 {
    public static void main(String[] args) {

        int liczba = 6;
        System.out.println("Silnia liczby: " + liczba + " to: " + silniaLiczby(liczba));
    }

    private static int silniaLiczby(int i) {
        int temp = 1;
        if(i>1){
            temp = temp * i * silniaLiczby(i-1);
        }
            return temp;
    }
}
