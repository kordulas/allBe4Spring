package Cwiczenie;

import javax.swing.text.Style;
import java.util.Locale;
import java.util.Scanner;

public class MegaAvans {

    public static void main(String[] args) {

        Order[] zamowienia = createNewOrders();
        Status status = readStatus();
        Order[] filteredOrders = filterOrdersByStatus(zamowienia,status);
        printOrders(filteredOrders,status);


    }
    private static void  printOrders(Order[] orders, Status status){
        System.out.println("Lista zamowien ze statusem: " + status);
        for(Order order : orders){
            System.out.println(order);
        }
    }

    private static Order[] filterOrdersByStatus(Order[] tab, Status status){
        int size = countStatus(tab, status);
        Order[] orderByStatus = new Order[size];
        int counter = 0;
        for(Order order : tab) {
            if (order.getStatus() == status) {
                orderByStatus[counter] = order;
                counter++;
            }
        }
            return orderByStatus;
    }

    private static int countStatus(Order[] tab, Status status) {
        int counter = 0;
        for (Order order: tab)
            if(order.getStatus() == status)
                counter++;
        return counter;
    }

    private static Status readStatus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj status zamowien do wyswietlenia: ");
        for(Status abc : Status.values())
            System.out.print(abc.name() + " ");
        System.out.println(" ");
        String status = scanner.nextLine().toUpperCase(Locale.ROOT);
        return Status.valueOf(status);
    }

    private static Order[] createNewOrders() {
        Order[] lista = new Order[10];
        lista[0] = new Order("Komputer Apple MacBook Pro 2018", 4999, Status.PAID);
        lista[1] = new Order("Telefon Samsung Galaxy s10", 2499, Status.SHIPPED);
        lista[2] = new Order("Telefon Apple iPhone X", 2999, Status.PAID);
        lista[3] = new Order("Pralka Beko X2000", 1499, Status.DELIVERED);
        lista[4] = new Order("Lodówka Samsung AT200", 1199, Status.DELIVERED);
        lista[5] = new Order("Głośnik JBL z100", 199, Status.NEW);
        lista[6] = new Order("Kino Domowe Yamaha XBC900", 3499, Status.CANCELLED);
        lista[7] = new Order("Konsola Sony Playstation 4", 1499, Status.SHIPPED);
        lista[8] = new Order("Adapter USBC - HDMI", 149, Status.PAID);
        lista[9] = new Order("Żelazko Zelmer PRIMO", 99.99, Status.SHIPPED);
        return lista;
    }
}
