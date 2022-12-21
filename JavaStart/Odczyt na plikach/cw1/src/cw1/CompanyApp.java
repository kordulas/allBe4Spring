package cw1;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {

    private static final String FILE_NAME = "employees.info";
    private static final int READ_FROM_USER = 1;
    private static final int READ_FROM_FILE = 2;

    private static Scanner skan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Wprowadzanie danych pracownikow - " + READ_FROM_USER);
        System.out.println("Wczytaj i wyswietl dane z pliku - " + READ_FROM_FILE);
        int option = skan.nextInt();
        skan.nextLine();

        if(option == READ_FROM_USER){
            Company company = createCompany();
            writeFile(company);
        }else if(option == READ_FROM_FILE){
            try {
                Company company = readFile();
                System.out.println(company);
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Blad odczytu danych");
            }
        }
        skan.close();
    }

    private static Company readFile() throws IOException, ClassNotFoundException {
        try (
                var fos = new FileInputStream(FILE_NAME);
                var oos = new ObjectInputStream(fos);
        )  {
            return  (Company)oos.readObject();
        }
    }

    private static void writeFile(Company company) {
        try (
                var fos = new FileOutputStream(FILE_NAME);
                var oos = new ObjectOutputStream(fos);
        )  {
            oos.writeObject(company);
            System.out.println("Utworzono plik");
        }catch (IOException e){
            System.err.println("Blad zapisu pliku");
        }
    }
    private static Company createCompany() {
        Company company = new Company();
        for(int i = 0; i < Company.MAX_EMPOYEES;i++){
            System.out.println("Wprowadz imie: ");
            String firstName = skan.nextLine();
            System.out.println("Wprowadz nazwisko: ");
            String lastName = skan.nextLine();
            System.out.println("Wprowadz wynagordzenie: ");
            int wyplata = skan.nextInt();
            skan.nextLine();
            company.add(new Employee(firstName,lastName,wyplata));
        }
        return company;
    }
}
