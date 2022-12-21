package cw2;

import java.util.Locale;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        Order[] tab1 = createNewTab();
        Status[] tab2 = Status.values();

        System.out.println("Podaj status zamówień do wyświetlenia");
        wyswietlStatusy(tab2);
        System.out.println("");
        Scanner skanuj = new Scanner(System.in);
        String wybor = skanuj.nextLine().toUpperCase(Locale.ROOT);
        Status status = Status.valueOf(wybor);
        Order[] orders = szukajStatusow(tab1,status);
        System.out.println(orders);
    }

    private static Order[] createNewTab() {
        Order[] orders = new Order[10];
        orders[0] = new Order("Komputer Apple MacBook Pro 2018", 4999, Status.PAID);
        orders[1] = new Order("Telefon Samsung Galaxy s10", 2499, Status.SHIPPED);
        orders[2] = new Order("Telefon Apple iPhone X", 2999, Status.PAID);
        orders[3] = new Order("Pralka Beko X2000", 1499, Status.DELIVERED);
        orders[4] = new Order("Lodówka Samsung AT200", 1199, Status.DELIVERED);
        orders[5] = new Order("Głośnik JBL z100", 199, Status.NEW);
        orders[6] = new Order("Kino Domowe Yamaha XBC900", 3499, Status.CANCELLED);
        orders[7] = new Order("Konsola Sony Playstation 4", 1499, Status.SHIPPED);
        orders[8] = new Order("Adapter USBC - HDMI", 149, Status.PAID);
        orders[9] = new Order("Żelazko Zelmer PRIMO", 99.99, Status.SHIPPED);
        return orders;
    }

    public static void wyswietlStatusy(Status[] tab){
        for(Status abc : tab)
            System.out.print(abc.name() + " ");
    }

    private static Order[] szukajStatusow(Order[] zamowienia, Status wybor){
        Order[] orders = new Order[zamowienia.length];
        int counter = 0;
        for(Order order : zamowienia){
            if(order.getStatus().equals(wybor)){
                orders[counter] = zamowienia[counter];
            }

        }
        return orders;
    }
}
