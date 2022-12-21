package com.company;

public class CenaNettoBrutto {
    public static void main(String[] args) {

        int cena = 250;
        double vat = cena * 0.23;
        double cenaBrutto = cena + vat;

        System.out.println(cena);
        System.out.println(vat);
        System.out.println(cenaBrutto);
    }
}
