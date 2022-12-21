package Cw1;

public class Hospital {

   private Person[] persons = new Person[MAX_EMPOYEE];
   private static final int MAX_EMPOYEE = 3;
   private int emploNumber = 0;


        public void addPerson(Person person) {
            if(emploNumber < MAX_EMPOYEE) {
                persons[emploNumber] = person;
                emploNumber++;
            }
        }

        public String getInfo(){
            String a = "";
            for (int i = 0; i < emploNumber; i++)
                a = a + persons[i].getInfo() + "\n";
            return a;
        }
}