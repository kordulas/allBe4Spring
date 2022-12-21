package calculator;

public class Rectangle implements shape{

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obliczPole() {
        return a*b;
    }

    @Override
    public double obliczObwod() {
        return 2 * a + 2 * b;
    }
}
