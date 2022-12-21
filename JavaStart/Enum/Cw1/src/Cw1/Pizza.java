package Cw1;

import javax.swing.*;
import java.util.Calendar;

public enum Pizza {

    MARGHERITA(true, true, false, false), CAPRICIOSA(true, true, true, false), PROSCIUTTO(true, true, false, true);

    private final boolean sosPomidorowy;
    private final boolean ser;
    private final boolean pieczarki;
    private final boolean szynka;

    Pizza(boolean sosPomidorowy, boolean ser, boolean pieczarki, boolean szynka) {
        this.sosPomidorowy = sosPomidorowy;
        this.ser = ser;
        this.pieczarki = pieczarki;
        this.szynka = szynka;
    }

    public boolean getSos() {
        return sosPomidorowy;
    }

    public boolean getSer() {
        return ser;
    }

    public boolean getPieczarki() {
        return pieczarki;
    }

    public boolean getSzynka() {
        return szynka;
    }

    @Override
    public String toString() {
        String result = "Pizza: " + name() +":";
        if(sosPomidorowy)
            result += " sos pomidorowy, ";
        if(ser)
            result += " ser, ";
        if(pieczarki)
            result += " pieczarki, ";
        if (szynka)
            result += " szynka.";
        return result;
    }
}