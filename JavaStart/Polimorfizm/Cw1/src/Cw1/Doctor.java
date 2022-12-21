package Cw1;

public class Doctor extends Person{

    private double bonus;

    public Doctor(String name, String lastName, double salary, double bonus) {
        super(name, lastName, salary);
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Bonus: " + bonus;
    }
}
