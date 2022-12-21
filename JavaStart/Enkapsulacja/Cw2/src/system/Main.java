package system;

import com.company.Client;
import com.company.MovieShow;
import com.company.Ticket;

public class Main {

    public static void main(String[] args) {

        MovieShow movie1 = new MovieShow("StarTrek", "SF", 140, 16, 100, 100);
        Client client1 = new Client("Jakub", "Kordulasinski", 30);
        TicketSystem ticketSystem = new TicketSystem();
        Ticket ticket1 = ticketSystem.createTicket(movie1, client1);

        Client client2 = new Client("Julia", "Wojciechowska", 25);
        Ticket ticket2 = ticketSystem.createTicket(movie1, client2);

        Client client3 = new Client("Max","Speed",20);
        Ticket ticket3 = ticketSystem.createTicket(movie1,client3);


        System.out.println("Sprzedane bilety");
        if(ticket1 != null)
            System.out.println(ticket1.getInfo());
        if(ticket2 != null)
            System.out.println(ticket2.getInfo());
        if (ticket3 !=null)
            System.out.println(ticket3.getInfo());



        System.out.println("Liczba pozostałych miejsc: " + movie1.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (movie1.getMaxSeats() - movie1.getFreeSeats()));
    }
}