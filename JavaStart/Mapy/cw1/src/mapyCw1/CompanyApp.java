package mapyCw1;

import java.util.Scanner;

public class CompanyApp {

    private static final int ADD_EMPLOYEE = 0;
    private static final int SEARCH_EMPLOYEE = 1;
    private static final int EXIT = 2;
    private static Scanner skanuj = new Scanner(System.in);

    public static void main(String[] args) {

        Company company1 = new Company();
        int userOpt;
        do{
            printOption();
            System.out.println("Wybierz opcje:");
            userOpt = skanuj.nextInt();
            skanuj.nextLine();
            switch (userOpt) {
                case ADD_EMPLOYEE:
                    Employee employee = readAndCreateEmployee();
                    company1.addEmployee(employee);
                    break;
                case SEARCH_EMPLOYEE:
                    findEmployee(company1);
                    break;
                case EXIT:
                    System.out.println("Do widzenia!");
            }
        }while (userOpt !=EXIT);
    }

    private static void findEmployee(Company company1) {
        System.out.println("Podaj imie pracownika:");
        String firstName = skanuj.nextLine();
        System.out.println("Podaj nazwisko pracownika:");
        String lastName = skanuj.nextLine();
        Employee employee = company1.getEmployee(firstName, lastName);
        if(employee == null)
            System.out.println("Brak pracownika");
        else
            System.out.println(employee);
    }

    private static Employee readAndCreateEmployee() {
        System.out.println("Podaj imie pracownika:");
        String firstName = skanuj.nextLine();
        System.out.println("Podaj nazzwisko pracownika:");
        String lastName = skanuj.nextLine();
        System.out.println("Podaj zarobki pracownika:");
        double zarobki = skanuj.nextInt();
        skanuj.nextLine();
        return new Employee(firstName,lastName,zarobki);
    }

    private static void printOption() {
        System.out.println("Dodaj pracownika wcisnij: " + ADD_EMPLOYEE);
        System.out.println("Szukaj pracownika wcisnij: " + SEARCH_EMPLOYEE);
        System.out.println("Wyjscie wcisnij: " + EXIT);
    }
}