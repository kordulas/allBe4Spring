package Przeliczanie;

public class Glowna {
    public static void main(String[] args) {

        PrzeliczanieH przelicznikCzasu = new PrzeliczanieH();
        int x = 2;
        System.out.println(przelicznikCzasu.przeliczHwM(x));
        System.out.println(przelicznikCzasu.przeliczHwM(przelicznikCzasu.przeliczMwSec(przelicznikCzasu.przeliczSecWMSec(x))));

    }
}
