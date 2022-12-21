package com.company;

import javax.swing.*;

public class DiscountApp {

    public static void main(String[] args) {

        Client klient1 = new Client("Jakub", "Kordulasinski", true);
        double price1 = 1200;
        Client klient2 = new Client("Miłosz", "Kowalski", false);
        double price2 = 1100;
        Client klient3 = new Client("Jan", null, true);
        double price3 = 1500;

        DiscountService ds = new DiscountService();

        double pricePremium = ds.calculateDiscountPrice(klient1, price1);
        double priceStandard = ds.calculateDiscountPrice(klient2, price2);

        PrintService ps = new PrintService();
        ps.printSummary(klient1,price1,pricePremium);
        ps.printSummary(klient2,price1,priceStandard);
        ps.printSummary(klient3,price3,ds.calculateDiscountPrice(klient3,price3));

    }
}