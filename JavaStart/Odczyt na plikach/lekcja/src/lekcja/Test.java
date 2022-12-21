package lekcja;

import java.io.*;

public class Test {
    public static void main(String[] args) {


        String nameFile = "Osoba1.obj";
        Person p1 = null;

        try(//var fos = new FileOutputStream(nameFile)
            //var oos = new ObjectOutput(fos);
            var fos = new FileInputStream(nameFile);
            var oos = new ObjectInputStream(fos);
        ){   //oos.writeObject(p1);
            //System.out.println("Zapisano obiekt do pliku");
            p1= (Person)oos.readObject();
        }catch (ClassNotFoundException | IOException e){
            System.err.println(" Nie udalo sie odczytac pliku " + nameFile);
            e.printStackTrace();
        }

        if(p1!=null){
            System.out.println("Wczytano dane o osobie: ");
            System.out.println(p1.getFirstName() + " " + p1.getLastName());
        }
    }
}
