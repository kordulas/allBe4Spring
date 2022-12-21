package Gra;

public class Defenders extends GameCharacters {

    private double extraDefense;

    public Defenders(String name, double energy, double attackPoint, double defensePoint, double extraDefense) {
        super(name, energy, attackPoint, defensePoint);
        this.extraDefense = extraDefense;
    }

    public double totalDefense(){
        return getDefensePoint() + extraDefense * getDefensePoint();
    }
}
