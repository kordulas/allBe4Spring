package Lekcja;

public class Lekcja {

    public static void main(String[] args) {

        String name = "Jakub";
        char[] reversename = new char[name.length()];
        int licznik = 0;

        for(int i = name.length()-1;i >=0;i--){
            reversename[licznik] = name.toCharArray()[i];
            licznik++;
        }
        System.out.println(reversename);

        String reverse = new StringBuilder(name).reverse().toString();
        System.out.println(reverse);


    }
}