package powtorka;

public enum Pizza {

    MARGHERITA(true,true,false,false), CAPRICIOSA(true,true,true,false), PROSCIUTTO(true,true,false,true);

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

    public boolean isSosPomidorowy() {
        return sosPomidorowy;
    }

    public boolean isSer() {
        return ser;
    }

    public boolean isPieczarki() {
        return pieczarki;
    }

    public boolean isSzynka() {
        return szynka;
    }

    @Override
    public String toString() {
        String result = "Pizza: " + name() + " ";
        if(sosPomidorowy)
            result += "sos pomidorowy, ";
        if(ser)
            result += "ser, ";
        if (pieczarki)
            result += "pieczarki, ";
        if (szynka)
            result += "szynka.";
        return result;
    }
}
