package Gra;

public class Bitwa {
    public static void main(String[] args) {

        Character smok = new Attacker("Smok",13,5,9);
        Character tytan = new Defender("Tytan",5,11,11);
        Character[] team1 = new Character[3];
        Character[] team2 = new Character[3];

        team1[0] = tytan;
        team1[1] = tytan;
        team1[2] = smok;

        team2[0] = smok;
        team2[1] = smok;
        team2[2] = tytan;

        System.out.println(Metody.atakDruzyny(team1));
        System.out.println(Metody.obronaDruzyny(team2));
        System.out.println(Metody.hpTeamu(team1));
        System.out.println(Metody.hpTeamu(team2));

        System.out.println(Metody.atak(team1,team2));
        System.out.println(Metody.atak(team2,team1));

    }
}
