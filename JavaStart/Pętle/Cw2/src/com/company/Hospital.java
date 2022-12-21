package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Hospital {

    final int hopspitalCapacity = 10;
    private Patient[] patients = new Patient[hopspitalCapacity];
    private int liczbaPacjentow = 0;

    public void addPatient(Patient patient) {
        if (liczbaPacjentow < hopspitalCapacity) {
            patients[liczbaPacjentow] = patient;
            liczbaPacjentow++;
        } else
            System.out.println("Przekroczono liczbę pacjentów");
    }


    public void displayPatientList() {
        for (int i = 0; i < liczbaPacjentow; i++) {
            System.out.println(patients[i].getFirstName() +" "+
                    patients[i].getLastName() +" "+
                    patients[i].getNrPesel());
        }
    }
}