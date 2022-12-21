package tablice1;

public class Test {
    public static void main(String[] args) {

        PersonDatabase pd = new PersonDatabase();
        pd.addPerson(new Person("Jakub","Kordulasinski","95042302646"));
        pd.addPerson(new Person("Anna","Kordulasinska","96042302646"));
        pd.addPerson(new Person("Skakanka","Kordulasinska","97042302646"));
        pd.addPerson(new Person("Skakanka","Mila","97042302646"));
        System.out.println(pd.getSize());
        Person person = pd.getPerson(1);
        System.out.println(person);
        //pd.getPerson(3);
        System.out.println("-------------------");
        pd.remowePerson(person);
        System.out.println(pd.toString());
        System.out.println(pd.getSize());

    }
}