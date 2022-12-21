package calculator;

public class Triangle implements shape{
    private double wysokosc;
    private double podstawa;
    private double ramie1;
    private double ramie2;

    public Triangle(double wysokosc, double podstawa, double ramie1, double ramie2) {
        this.wysokosc = wysokosc;
        this.podstawa = podstawa;
        this.ramie1 = ramie1;
        this.ramie2 = ramie2;
    }

    @Override
    public double obliczPole() {
        return 0.5 * wysokosc * podstawa;
    }

    @Override
    public double obliczObwod() {
        return podstawa + ramie1 + ramie2;
    }
}
