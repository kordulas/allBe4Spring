package Nieruchomosci;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OfferReader {
    private static final int MAX_OFFERS = 10;

    static Property[] readOffers(String fileName) throws FileNotFoundException {
        Property[] property = new Property[MAX_OFFERS];
        try (
                Scanner skanuj = new Scanner(new File(fileName))) {
            skanuj.nextLine();
            for (int i = 0; i < MAX_OFFERS; i++) {
                property[i] = createOffer(skanuj.nextLine());
            }
        }return property;
    }

    private static Property createOffer(String line) {
        String[] data = line.split(";");
        return new Property(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2]));
    }
}
