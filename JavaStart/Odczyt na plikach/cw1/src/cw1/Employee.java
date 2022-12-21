package cw1;

public class Employee extends Person{

    private double wyplata;
    public Employee(String firstName, String lastName, double wyplata) {
        super(firstName, lastName);
        this.wyplata = wyplata;
    }

    public double getWyplata() {
        return wyplata;
    }

    public void setWyplata(int wyplata) {
        this.wyplata = wyplata;
    }

    @Override
    public String toString() {
        return super.toString() + " ,wypłata: " + wyplata;
    }
}
