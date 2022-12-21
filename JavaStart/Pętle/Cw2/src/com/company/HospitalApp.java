package com.company;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {

        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;
        Scanner skanuj = new Scanner(System.in);
        int option = -1;
        Hospital hospital = new Hospital();

        do{
            System.out.println("Dostępne opcje: ");
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - dodanie pacjenta");
            System.out.println("2 - wyświetlenie listy pacjentów");

            System.out.println("Wybierz opcję: ");
            option = skanuj.nextInt();
            skanuj.nextLine();

            switch (option) {
                case addPatient:
                    Patient patient = new Patient();
                    System.out.println("Imię: ");
                    patient.setFirstName(skanuj.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setLastName(skanuj.nextLine());
                    System.out.println("PESEL: ");
                    patient.setNrPesel(skanuj.nextLine());
                    hospital.addPatient(patient);
                    break;
                case printPatients:
                    hospital.displayPatientList();
                    break;
                case exit:
                    System.out.println("Zamykam program!");
                    break;
                default:
                    System.out.println("Nie znaleziono takiej opcji");
            }
    }while (option !=exit);
        skanuj.close();
}
}
