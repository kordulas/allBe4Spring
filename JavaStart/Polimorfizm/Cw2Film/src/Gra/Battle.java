package Gra;

public class Battle {

    static void fight(Teams team1, Teams team2){
        double team2Energy = attack(team1,team2);
        double team1Energy = attack(team2,team1);
        double energyDiff = team1Energy - team2Energy;
        if (energyDiff > 0)
            System.out.println("Wygrywa druzyna: " + team1.getTeamName() + " z przewagą: " + energyDiff);
        else if ( energyDiff < 0)
            System.out.println("Wygrywa druzyna: " + team2.getTeamName() + " z przewagą: " + (-energyDiff));
        else
            System.out.println("Remis");

    }

    private static double attack(Teams attacker, Teams defender){
        double attack = attacker.attackPoints();
        double defense = defender.defensePoints();
        double attackPower = attack - defense;
        double energy = defender.hpPoints();
        if(attackPower > 0) {
            double result = energy - attackPower;
            return result >=0? result : 0;
        }
        return energy;
    }
}
