package Gra;

public class Defender extends Character{

    public Defender(String name, double attackPoint, int defendPoint, int hp) {
        super(name, attackPoint, defendPoint, hp);
        bonusDefender();
    }

    public void bonusDefender(){
        //defender.setDefendPoint(defender.getDefendPoint() + (defender.getDefendPoint() * 0.2));
        setDefendPoint(getDefendPoint() + (getDefendPoint() *0.2));
    }
}
