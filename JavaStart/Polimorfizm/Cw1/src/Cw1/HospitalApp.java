package Cw1;

public class HospitalApp {

    public static void main(String[] args) {

        Person osoba3 = new Doctor("Maciej","Prefeska",7500,2000);
        Person osoba2 = new Nurse("Ania","Dobroszewska",2200,5);
        Person osoba1 = new Nurse("Marta","Danielska",2200,10);

        Hospital szpital = new Hospital();
        szpital.addPerson(osoba1);
        szpital.addPerson(osoba2);
        szpital.addPerson(osoba3);


        System.out.println(szpital.getInfo());
    }
}
