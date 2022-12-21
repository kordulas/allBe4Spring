package Cw2;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        Order[] orders = creareOrders();
        Status status = readStatus();
        Order[] filteredOrders = filterOrdersByStatus(orders, status);
        printOrders(filteredOrders, status);

    }

    public static Order[] creareOrders() {
        Order[] orders = new Order[10];
        orders[0] = new Order("Komputer Apple MacBook 2020", 4999, Status.PAID);
        orders[1] = new Order("Telefon Lg G5", 999, Status.NEW);
        orders[2] = new Order("Telewizor Samsung 2020", 1999, Status.SHIPPED);
        orders[3] = new Order("Telefon Apple IPhone 12pro", 6999, Status.PAID);
        orders[4] = new Order("Lodówka Samsung AT200", 1199, Status.DELIVERED);
        orders[5] = new Order("Głośnik JBL z100", 199, Status.NEW);
        orders[6] = new Order("Kino Domowe Yamaha XBC900", 3499, Status.CANCELLED);
        orders[7] = new Order("Konsola Sony Playstation 4", 1499, Status.SHIPPED);
        orders[8] = new Order("Adapter USBC - HDMI", 149, Status.PAID);
        orders[9] = new Order("Żelazko Zelmer PRIMO", 99.99, Status.SHIPPED);
        return orders;
    }

    private static Status readStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj status zamówień do wyświetlenia (");
        for (Status os : Status.values()) {
            System.out.print(os.name() + " ");
        }
        System.out.println("):");
        String status = scanner.nextLine();
        return Status.valueOf(status);
    }

    private static Order[] filterOrdersByStatus(Order[] orders, Status orderStatus) {
        int size = countOrderByStatus(orders, orderStatus);
        Order[] orderByStatus = new Order[size];
        int counter = 0;
        for (Order order : orders) {
            if (order.getStatus() == orderStatus) {
                orderByStatus[counter] = order;
                counter++;
            }
        }
        return orderByStatus;
    }

    private static int countOrderByStatus(Order[] orders, Status orderStatus) {
        int count = 0;
        for (Order order : orders) {
            if (order.getStatus() == orderStatus)
                count++;
        }
        return count;
    }

    private static void printOrders(Order[] filteredOrders, Status orderStatus) {
        System.out.println("Lista zamówień ze statusem " + orderStatus);
        for (Order order : filteredOrders) {
            System.out.println(order);
        }
    }
}