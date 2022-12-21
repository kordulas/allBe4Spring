package Gra;

public class GameCharacters {

    private String name;
    private double energy;
    private double attackPoint;
    private double defensePoint;

    public GameCharacters(String name, double energy, double attackPoint, double defensePoint) {
        this.name = name;
        this.energy = energy;
        this.attackPoint = attackPoint;
        this.defensePoint = defensePoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(double attackPoint) {
        this.attackPoint = attackPoint;
    }

    public double getDefensePoint() {
        return defensePoint;
    }

    public void setDefensePoint(double defensePoint) {
        this.defensePoint = defensePoint;
    }

    public double totalAttack(){
        return attackPoint;
    }
    public double totalDefense(){
        return defensePoint;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }
}
