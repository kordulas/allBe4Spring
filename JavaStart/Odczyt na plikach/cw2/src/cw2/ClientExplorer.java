package cw2;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientExplorer {
    public static void main(String[] args) {

        final String fileName = "clients.csv";
        try {
            Client[] clients = ClientDataReader.readFile(fileName);
            printMostValuableClient(clients);
            String country = readCountryFromUser();
            printClientsByCountry(clients, country);
            printAvgValueForCountry(clients,country);
        }catch (FileNotFoundException e){
            System.out.println("Brak pliku o nazwie: " + fileName);
        }
    }

    private static void printAvgValueForCountry(Client[] clients, String country) {
        double total = 0;
        int clientsFromCountryCounter = 0;
        for (Client client:clients){
            if(country.equals(client.getCountry())){
                total += client.getMoneySpend();
                clientsFromCountryCounter++;
            }
        }if(total > 0){
            double avgValue = total / clientsFromCountryCounter;
            System.out.printf("Srednia wartosc klienta z: %s to %.2f",country,avgValue);
        }
    }

    private static void printClientsByCountry(Client[] clients, String country) {
        System.out.println("Kliencie z kraju: " + country + ":");
        boolean atLeastOneClient = false;
        for (Client client : clients) {
            if (country.equals(client.getCountry())) {
                System.out.println(client);
                atLeastOneClient = true;
            }
        }if(!atLeastOneClient)
            System.out.println("Brak klientow z tego kraju");
    }
    private static String readCountryFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz nazwe kraju z ktorego klienci Cie interesuja");
        return scanner.nextLine();
    }

    private static void printMostValuableClient(Client[] clients) {
        Client mostValubleClient = clients[0];
        for(Client client : clients){
            if(client.getMoneySpend() > mostValubleClient.getMoneySpend()){
                mostValubleClient = client;
            }
        }
        System.out.println("Najbardziej wartosciowy klient to: " + mostValubleClient);
    }
}