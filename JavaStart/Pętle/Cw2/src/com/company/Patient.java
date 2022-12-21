package com.company;

public class Patient {

    private String firstName;
    private String lastName;
    private String nrPesel;

    public Patient(String firstName, String lastName, String nrPesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nrPesel = nrPesel;
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

    public String getNrPesel() {
        return nrPesel;
    }

    public void setNrPesel(String nrPesel) {
        this.nrPesel = nrPesel;
    }

    public Patient() {
    }

}
