package Gra;

public class Metody {
    public static double atakDruzyny(Character[] tab){
        double punktyAtaku = 0;
        for (int i = 0; i <tab.length; i++)
            punktyAtaku = punktyAtaku + tab[i].getAttackPoint();
        return punktyAtaku;
    }

    public static double obronaDruzyny(Character[] tab){
        double punktyObrony = 0;
        for (int i = 0; i < tab.length; i++)
            punktyObrony = punktyObrony + tab[i].getDefendPoint();
        return punktyObrony;
    }

    public static double hpTeamu(Character[] tab){
        double hpTeamu = 0;
        for (int i = 0; i < tab.length; i++)
            hpTeamu = hpTeamu + tab[i].getHp();
        return hpTeamu;

    }

    public static double atak(Character[] tab, Character[] tab2){
        double obrazenia = atakDruzyny(tab) - obronaDruzyny(tab2);
        double koncoweHp = 0;
        if(obrazenia > 0)
           koncoweHp= hpTeamu(tab2) - obrazenia;
        return  koncoweHp;
    }

}
