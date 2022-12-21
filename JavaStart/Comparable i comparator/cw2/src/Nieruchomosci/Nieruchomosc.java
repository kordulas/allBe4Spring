package Nieruchomosci;

public class Nieruchomosc implements Comparable<Nieruchomosc> {

    private String city;
    private double price;
    private double area;

    public Nieruchomosc(String city, double price, double area) {
        this.city = city;
        this.price = price;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double cena) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double cenaM2) {
        this.area = area;
    }

    double getPricePerSqm() {
        return price / area;
    }

    @Override
    public int compareTo(Nieruchomosc n) {
        return Double.compare(getPricePerSqm(), n.getPricePerSqm());
    }
    @Override
    public String toString() {
        return city + ", " + price + "zł, " + area + "mkw, "
                + String.format("%.2f", getPricePerSqm()) + "zł/mkw";
    }
}
