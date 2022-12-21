package Nieruchomosci;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Nieruchomosci {
    public static void main(String[] args) {

        try {
            Nieruchomosc[] nieruchomoscs = OdczytZPliku.readOffers("test.csv");
            Arrays.sort(nieruchomoscs);
            for (Nieruchomosc acs : nieruchomoscs)
                System.out.println(acs);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}