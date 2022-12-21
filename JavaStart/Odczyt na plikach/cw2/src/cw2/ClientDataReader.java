package cw2;

import javax.crypto.Cipher;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientDataReader {
    static Client[] readFile(String fileName) throws FileNotFoundException {
        final int linesNumber = countLinesWithoutHeader(fileName);
        Client[] clients = new Client[linesNumber];
        try(Scanner scanner = new Scanner(new File(fileName))){
            scanner.nextLine();
            for (int i = 0; i < clients.length;i++){
                String csvLine = scanner.nextLine();
                clients[i] = createClientFormCsv(csvLine);
            }
        }return clients;
    }

    private static Client createClientFormCsv(String csvLine) {
        String[] data = csvLine.split(",");
        int id = Integer.parseInt(data[0]);
        String firstName = data[1];
        String lastName = data[2];
        String country = data[3];
        double money = Double.parseDouble(data[4]);
        return new Client(id,firstName,lastName,country,money);

    }

    private static int countLinesWithoutHeader(String fileName) throws FileNotFoundException {
        int lines = 0;
        try(Scanner scan = new Scanner(new File(fileName))){
            scan.nextLine();
            while (scan.hasNextLine()){
                scan.nextLine();
                lines++;
            }
        }return lines;
    }
}