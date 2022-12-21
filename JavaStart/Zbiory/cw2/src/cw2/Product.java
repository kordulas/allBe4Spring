package cw2;

import java.util.Objects;

public class Product {

    private String productName;
    private double cena;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Product(String productName, double cena) {
        this.productName = productName;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Nazwa produktu: " + productName + " ,cena: " + cena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }
}
