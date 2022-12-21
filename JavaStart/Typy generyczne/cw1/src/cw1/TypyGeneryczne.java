package cw1;

public class TypyGeneryczne {

    public static void main(String[] args) {

        Pair<String, String> pair1 = new Pair<>("Anna", "Kowalska");
        Pair<Double, Double> pair2 = new Pair<>(5.5, 10.5);
        Pair<Integer, String> pair3 = new Pair<>(12341, "Anna Lewandowska");

        System.out.println(pair1.getT() + " " + pair1.getV());
        double suma = pair2.getT() + pair2.getV();
        System.out.println(suma);
        printPair(pair3);
        printPair(pair2);
    }

    static <T,V> void printPair(Pair<T,V> pair){
        System.out.println(pair.getT() + " " +  pair.getV());
    }
}