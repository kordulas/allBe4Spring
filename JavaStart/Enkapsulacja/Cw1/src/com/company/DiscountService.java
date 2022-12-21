package com.company;

public class DiscountService {

    public double calculateDiscountPrice(Client klient, double price){
        if(klient.isPremium())
            return calculatePremiumDiscount(price);
        else
            return calculateStandardDiscount(price);
    }

    private double calculateStandardDiscount(double price){
        if(price >1000)
            return applyDiscount(price, 0.1);
        else
            return price;
    }

    private double calculatePremiumDiscount(double price){
        if(price >1000)
            return applyDiscount(price, 0.15);
        else
            return price;
    }

    private double applyDiscount(double price,double discount){
        return price*(1-discount);
    }
}
