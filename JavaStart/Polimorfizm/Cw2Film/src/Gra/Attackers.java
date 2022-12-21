package Gra;

public class Attackers extends GameCharacters{

    private double extraAttack;

    public Attackers(String name, double energy, double attackPoint, double defensePoint, double extraAttack) {
        super(name, energy, attackPoint, defensePoint);
        this.extraAttack = extraAttack;
    }

    @Override
    public double totalAttack() {
        return getAttackPoint() + extraAttack * getAttackPoint();
    }

    public double getExtraAttack() {
        return extraAttack;
    }

    public void setExtraAttack(double extraAttack) {
        this.extraAttack = extraAttack;
    }
}
