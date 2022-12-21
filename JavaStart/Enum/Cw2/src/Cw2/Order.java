package Cw2;

public class Order {

    private String nazwaProduktu;
    private double cena;
    private Status status;

    public Order(String nazwaProduktu, double cena, Status status) {
        this.nazwaProduktu = nazwaProduktu;
        this.cena = cena;
        this.status = status;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Zamówienie: " + getNazwaProduktu() + " " + ",cena: " + cena + " " +  ",status: " + status.getDescription();
    }

//    public void addOrder(){
//        int counter = 0;
//        if(this != null){
//            orders[counter] = this;
//            counter++;
//        }
//    }
}
