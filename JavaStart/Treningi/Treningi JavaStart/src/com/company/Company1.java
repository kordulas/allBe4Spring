package com.company;

public class Company1 {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.imie = "Jakub";
        employee1.nazwisko = "Kordulas";
        employee1.rokUrodzenia = 1990;
        employee1.stazPracy = 0;

        Employee employee2 = new Employee();
        employee2.imie = "Michal";
        employee2.nazwisko = "Kordulas";
        employee2.rokUrodzenia = 1993;
        employee2.stazPracy = 2.5;

        Employee employee3 = employee2;
        employee2 = null;
        System.out.println(employee1.imie);
        System.out.println(employee2.imie);
        System.out.println(employee3.imie);
        /* employee3.imie = "Jennifer";
        employee3.nazwisko = "Kordulas";
        employee3.rokUrodzenia = 1994;
        employee3.stazPracy = 4;

        System.out.println(employee1.imie + " " + employee1.nazwisko + " " + employee1.rokUrodzenia + " " + employee1.stazPracy);
        System.out.println(employee2.imie + " " + employee2.nazwisko + " " + employee2.rokUrodzenia + " " + employee2.stazPracy);
        System.out.println(employee3.imie + " " + employee3.nazwisko + " " + employee3.rokUrodzenia + " " + employee3.stazPracy);*/
    }
}

class Employee{
    String imie;
    String nazwisko;
    int rokUrodzenia;
    double stazPracy;
}
