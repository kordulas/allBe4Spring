package data;

public class Car {
    int year;
    public String brand;
    public String model;
    public String color;

    public Car(int year, String brand,String model,String color){
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
    public Car(int year, String brand,String model){
        this.year = year;
        this.brand = brand;
        this.model = model;
    }
}
