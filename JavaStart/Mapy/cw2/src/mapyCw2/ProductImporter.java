package mapyCw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ProductImporter {

    static Map<String, TreeSet<Product>> readFile(String fileName) throws FileNotFoundException {
        Map<String, TreeSet<Product>> productMap = new HashMap<>();
        try(Scanner fileReader = new Scanner(new File(fileName))){
            fileReader.nextLine();
            while (fileReader.hasNextLine()){
                String[] split = fileReader.nextLine().split(";");
                String category = split[0];
                Product product = new Product(split[1], Double.parseDouble(split[2]));
                insertProductToMap(productMap, category, product);
            }
            System.out.println(productMap);
        }return productMap;
    }

    private static void insertProductToMap(Map<String, TreeSet<Product>> productMap, String category, Product product) {
        if(productMap.containsKey(category)){
            productMap.get(category).add(product);
        }else{
            TreeSet<Product> categorySet = new TreeSet<>();
            categorySet.add(product);
            productMap.put(category,categorySet);
        }
    }
}
