package cw2;

public class Order {

    private String nazwaZamowienia;
    private double cena;
    Status status;

    public Order(String nazwaZamowienia, double cena, Status status) {
        this.nazwaZamowienia = nazwaZamowienia;
        this.cena = cena;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return nazwaZamowienia + (cena + " zł") + "-" + status;
    }
}
