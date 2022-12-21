package com.company;

public class Kurs {

    public String kursName;
    public String idKurs;
    public int price;
    public String aboutKurs;

    public String getKursName() {
        return kursName;
    }

    public void setKursName(String kursName) {
        this.kursName = kursName;
    }

    public String getIdKurs() {
        return idKurs;
    }

    public void setIdKurs(String idKurs) {
        this.idKurs = idKurs;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAboutKurs() {
        return aboutKurs;
    }

    public void setAboutKurs(String aboutKurs) {
        this.aboutKurs = aboutKurs;
    }

    public void printInfo(){
        System.out.println(getAboutKurs() + "" + getIdKurs() +" "
        + getKursName() +" " + getPrice());
    }
}
