package Cw1;

public class DataStore {

    private static final int MAX_CAPACITY = 100;
    private Computer[] computers = new Computer[MAX_CAPACITY];
    private int computersNumber =0;

    public void addComputer(Computer computer){
        if(computer instanceof Computer && computersNumber <MAX_CAPACITY){
            computers[computersNumber] = computer;
            computersNumber++;
        }else if(computersNumber > MAX_CAPACITY)
            System.out.println("Brak miejsca w magazynie");
         else
            System.out.println("Nieprawidlowy obiek");
    }


    public String checkStore(){
        String info = "";
        for (int i = 0; i < computersNumber; i++) {
            info = info + computers[i].toString() + "\n";
        }
        return info;
    }

    public int checkAvailability(Computer find){
        if(find == null)
            return 0;

        int licznik = 0;
        for (int i = 0; i < computersNumber; i++) {
            if(find.equals(computers[i]))
                licznik++;
        }
        return licznik;
    }
}
