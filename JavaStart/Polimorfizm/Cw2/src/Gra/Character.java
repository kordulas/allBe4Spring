package Gra;

public class Character {
    private String name;
    private double attackPoint;
    private double defendPoint;
    private int hp;

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

    public double getDefendPoint() {
        return defendPoint;
    }

    public void setDefendPoint(double defendPoint) {
        this.defendPoint = defendPoint;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Character(String name, double attackPoint, int defendPoint, int hp) {
        this.name = name;
        this.attackPoint = attackPoint;
        this.defendPoint = defendPoint;
        this.hp = hp;
    }
}
