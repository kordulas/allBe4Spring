package com.company;

public class Client {

    private String firstName;
    private String lastName;
    private int wiek;

    String getFullName() {
        return firstName + " " + lastName;
    }


    public Client(String firstName, String lastName, int wiek){
    this.firstName=firstName;
    this.lastName=lastName;
    this.wiek=wiek;
}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
