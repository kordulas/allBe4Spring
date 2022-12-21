package sklepik;

public class Shop {
    public static void main(String[] args) {

        Product product1 = new Product("Czekolada mleczna","Milka");
        Offer oferta1 = new Offer(product1,3.90,true);
        oferta1.printInfo();
    }
}
