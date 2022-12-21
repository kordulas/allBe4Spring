package com.company;

public class Main {

    public static void main(String[] args) {

        Pracownik[] pracownicy = createWorkers();
        wyswietlInfo(pracownicy);
        System.out.println("Suma miesięcznych wynagrodzeń wynosi: " + pensjeMiesieczne(pracownicy));
        System.out.println("Suma rocznych wynagrodzeń wynosi: " + pensjeRoczne(pracownicy));

    }

    private static Pracownik[] createWorkers() {
        Pracownik[] pracownicy = new Pracownik[10];
        pracownicy[0] = new Etatowy("Jakub", "Kordulasisnki");
        pracownicy[1] = new Etatowy("Doug", "Polk");
        pracownicy[2] = new Etatowy("Wiktor", "Malinowski");
        pracownicy[3] = new Etatowy("Dominik", "Panka");
        pracownicy[4] = new Etatowy("Pawel", "Brzeski");
        pracownicy[5] = new Dorywczy("Mikolaj", "Zawadzki");
        pracownicy[6] = new Dorywczy("Jakub", "Michalak");
        pracownicy[7] = new Dorywczy("Banjamin", "Roller");
        pracownicy[8] = new Dorywczy("Mustpha", "Kanit");
        pracownicy[9] = new Dorywczy("Maria", "Ho");
        return pracownicy;
    }

    private static void wyswietlInfo(Pracownik[] pracowniks) {
        for(Pracownik pracownicy : pracowniks)
            System.out.println(pracownicy);
    }

    private static double pensjeMiesieczne(Pracownik[] pracowniks){
        double wyplaty = 0;
        for(int i = 0; i <pracowniks.length; i++) {
            if (pracowniks[i] instanceof Etatowy)
                wyplaty = wyplaty + ((Etatowy) pracowniks[i]).getWyplata();
            else {
                wyplaty = wyplaty + ((Dorywczy) pracowniks[i]).getWyplata();
            }
        }
        return wyplaty;
    }

    private static double pensjeRoczne(Pracownik[] pracowniks){
        double wyplaty = 0;
        for(Pracownik pracownik : pracowniks) {
            wyplaty = wyplaty + pracownik.obliczPensje();
        }
        return wyplaty;
    }
}