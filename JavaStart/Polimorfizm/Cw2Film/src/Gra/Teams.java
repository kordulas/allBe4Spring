package Gra;

public class Teams {

    private String teamName;
    private GameCharacters[] characters = new GameCharacters[3];

    public Teams(String teamName, GameCharacters char1, GameCharacters char2, GameCharacters char3) {
        this.teamName = teamName;
        characters[0] = char1;
        characters[1] = char2;
        characters[2] = char3;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public GameCharacters[] getCharacters() {
        return characters;
    }

    public void setCharacters(GameCharacters[] characters) {
        this.characters = characters;
    }

    public double attackPoints(){
        double attack = 0;
        for(GameCharacters character : characters)
            attack = attack + character.totalAttack();
        return attack;
    }

    public double defensePoints(){
        double defense = 0;
        for(GameCharacters character : characters)
            defense = defense + character.totalDefense();
        return defense;
    }

    public double hpPoints(){
        double hpPoint = 0;
        for (GameCharacters character : characters)
            hpPoint = hpPoint + character.getEnergy();
        return hpPoint;
    }
}
