package com.company;

public abstract class Pracownik {

    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Pracownik(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public abstract double obliczPensje();

}
