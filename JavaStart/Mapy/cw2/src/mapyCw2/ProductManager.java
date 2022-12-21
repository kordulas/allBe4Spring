package mapyCw2;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProductManager {
    public static void main(String[] args) {

        try {
            Map<String, TreeSet<Product>> productMap = ProductImporter.readFile("dane.csv");
            String category = readCategoryFromUser();
            printCategoryStats(productMap,category);
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku z danymi produktow");
        }
    }

    private static String readCategoryFromUser() {
        Scanner skan = new Scanner(System.in);
        System.out.println("Podaj nazwe kategorii do wyswietlenia: ");
        return skan.nextLine();
    }

    private static void printCategoryStats(Map<String, TreeSet<Product>> productMap, String category) {
        TreeSet<Product> products = productMap.get(category);
        if(products == null){
            System.out.println("Brak produktow z danej kategorii.");
        }else{
            printAll(products);
            printAvgPrice(products);
            printChapestAndMostExpensiveProduct(products);
        }
    }

    private static void printAvgPrice(Set<Product> products) {
        double sum = 0;
        int counter = 0;
        for (Product product : products) {
            sum = sum + product.getPrice();
            counter++;
        }
        //double avgPrice = sum / products.size();
        double avgPrice = sum / counter;
        System.out.format("Srednia cena produktow: %.2f ",avgPrice);
        System.out.println(" ");
    }

    private static void printAll(Set<Product> products) {
        for(Product product : products)
            System.out.println(product);
    }

    private static void printChapestAndMostExpensiveProduct(TreeSet<Product> products) {
        System.out.println("Najtanszy produkt to: " + products.first());
        System.out.println("Najdrozszy produkt to: " + products.last());
    }
}
