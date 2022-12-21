package com.company;

public class Tires extends Part{

    public int size;
    public int width;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Tires(int idNumber, String idProducer, String model, String partNumber, int size, int width) {
        setIdNumber(idNumber);
        setIdProducer(idProducer);
        setModel(model);
        setPartNumber(partNumber);
        this.size = size;
        this.width = width;
    }

    void printInfo(){
        System.out.println(getIdNumber() + " " + getPartNumber() + " " + getIdProducer() + " " + getModel() + " "
        + size + " " + width);
    }
}
