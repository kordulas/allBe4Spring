package Nieruchomosci;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class PropertyApp {
    public static void main(String[] args) {

        try {
            Property[] properties = OfferReader.readOffers("tabela.csv");
            Arrays.sort(properties);
            for(Property property : properties)
                System.out.println(property);
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku tabela.csv");
        }

    }
}
