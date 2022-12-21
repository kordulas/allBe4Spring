package Gra;

public class Attacker extends Character{


    public Attacker(String name, double attackPoint, int defendPoint, int hp) {
        super(name, attackPoint, defendPoint, hp);
        bonusAtacker();
    }

    public void bonusAtacker(){
        //attacker.setAttackPoint(attacker.getAttackPoint() + (attacker.getAttackPoint() *0.2));
        setAttackPoint(getAttackPoint() + (getAttackPoint() *0.2));
    }
}
