package cw2;

import java.util.Arrays;

public class Cart {
    private static final int MAX_PRODUCTS = 10;
    private Product[] products = new Product[MAX_PRODUCTS];
    int productCount;

    public void addProduct(Product product) {
        if (productCount<MAX_PRODUCTS) {
            products[productCount] = product;
            productCount++;
        }
    }
    public double totalCost(){
        return sumPrices(0);
    }

    private double sumPrices(int counter){
        if(productCount == 0)
            return 0;
        else if(counter < (productCount-1)){
            return products[counter].getPrice() + sumPrices(++counter);
        }else
        return products[counter].getPrice();
    }

    @Override
    public String toString() {
        return Arrays.toString(products);
    }
}
