package Nieruchomosci;

public class Property implements Comparable<Property> {
    private String city;
    private double price;
    private double area;

    public Property(String city, double price, double area) {
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

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Nieruchomosc, " +
                "city: " + city +
                ", price: " + price +
                ", area: " + area +
                ", cena za metr: " + String.format("%.2f",getPricePerArea());
    }

    public double getPricePerArea(){
        return price/area;
    }

    @Override
    public int compareTo(Property o) {
       return Double.compare(this.getPricePerArea(),o.getPricePerArea());
    }
}
