package cw2;

public class Testy {
    public static void main(String[] args) {

        Cart cart1 = new Cart();
        cart1.addProduct(new Product("Czapka",35));
        cart1.addProduct(new Product("Koc",45));
        cart1.addProduct(new Product("Firana",335));
        cart1.addProduct(new Product("Spodnie",315));
        cart1.addProduct(new Product("Koszulka",35));
        cart1.addProduct(new Product("Koszula",95));
        cart1.addProduct(new Product("Kurtka",359));
        cart1.addProduct(new Product("Marynarka",235));
        cart1.addProduct(new Product("Sweter",229));
        cart1.addProduct(new Product("Bluza",135));
        System.out.println(cart1);

        System.out.println(cart1.totalCost());
    }
}
