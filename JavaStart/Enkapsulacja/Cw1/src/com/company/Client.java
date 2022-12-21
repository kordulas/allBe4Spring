package com.company;

public class Client {

    private String firstName;
    private String secondName;
    private boolean isPremium;

    public Client(String firstName, String secondName, boolean isPremium) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.isPremium = isPremium;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

}