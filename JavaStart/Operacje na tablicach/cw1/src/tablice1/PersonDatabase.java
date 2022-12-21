package tablice1;

import java.util.Arrays;

public class PersonDatabase {

    Person[] people = new Person[1];
    private int counter = 0;

    public void addPerson(Person p){
        if(p == null) {
            throw new NullPointerException("Popraw dane");
        }
        if(counter == people.length){
            people = Arrays.copyOf(people,people.length *2);
        }
        people[counter] = p;
        counter++;
    }

    public void remowePerson(Person p){
        for(int i = 0; i <people.length;i++){
            if(p.equals(people[i])){
                System.arraycopy(people, i+1,people,i,people.length - i -1);
                people[people.length-1] = null;
            }
        }if(p == null){
            throw new NullPointerException("Popraw dane");
        }
    }

    public Person getPerson(int index){
        if(index > people.length || index < 0)
            throw new ArrayIndexOutOfBoundsException("Nie moźna podawać wartości mniejszej niź 1");
        return people[index-1];
    }


    public int getSize(){
        int count = 0;
        for (int i = 0; i < people.length; i++) {
            if(people[i] != null)
                count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return "PersonDatabase{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}
