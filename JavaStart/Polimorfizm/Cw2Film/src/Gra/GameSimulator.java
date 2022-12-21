package Gra;

public class GameSimulator {
    public static void main(String[] args) {

        Attackers character1 = new Attackers("Joe", 100, 100, 100, 0.2);
        Attackers character2 = new Attackers("Martha", 100, 100, 100, 0.2);
        Defenders character3 = new Defenders("Kris", 100, 100, 100, 0.2);
        Attackers character4 = new Attackers("Matt", 100, 100, 100, 0.8);
        Attackers character5 = new Attackers("Martha", 100, 100, 100, 0.2);
        Defenders character6 = new Defenders("Belly", 100, 100, 100, 1);

        Teams team1 = new Teams("TeamOne", character2, character3, character1);
        Teams team2 = new Teams("TeamTwo", character5, character6, character4);

        Battle.fight(team1,team2);

    }
}