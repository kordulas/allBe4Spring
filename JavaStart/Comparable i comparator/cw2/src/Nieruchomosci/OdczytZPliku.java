package Nieruchomosci;

import java.io.*;
import java.util.Scanner;

public class OdczytZPliku {
    private static final int OFFERS_IN_FILE = 10;

    static Nieruchomosc[] readOffers(String fileName) throws FileNotFoundException {
        Nieruchomosc[] nieruchomosci = new Nieruchomosc[OFFERS_IN_FILE];
        try(Scanner skanuj = new Scanner(new File(fileName))){
            skanuj.nextLine();
            for(int i = 0; i < OFFERS_IN_FILE; i++){
                nieruchomosci[i] = crateOffer(skanuj.nextLine());
            }
        }
        return nieruchomosci;
    }

    private static Nieruchomosc crateOffer(String line) {
        String[] data = line.split(";");
        return new Nieruchomosc(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2]));
    }
}