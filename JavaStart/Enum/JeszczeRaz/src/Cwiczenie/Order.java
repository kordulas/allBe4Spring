package Cwiczenie;

public class Order {

    private String nazwaZamowienia;
    private double cena;
    private Status status;

    public Order(String nazwaZamowienia, double cena, Status status) {
        this.nazwaZamowienia = nazwaZamowienia;
        this.cena = cena;
        this.status = status;
    }

    public String getNazwaZamowienia() {
        return nazwaZamowienia;
    }

    public double getCena() {
        return cena;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return nazwaZamowienia + " " + (cena + "zł") + " " +  status;
    }
}
