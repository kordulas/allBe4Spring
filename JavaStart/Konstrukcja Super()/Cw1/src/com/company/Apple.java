package com.company;

public class Apple extends Fruit{

    public String appleType;
    public static final String TYPE = "Jabłko";
    public static final String KSZTALT = "Okrągly";

    public Apple( double weight,String appleType) {
        super(KSZTALT, weight);
        this.appleType = appleType;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " typ: " + appleType;
    }
}
