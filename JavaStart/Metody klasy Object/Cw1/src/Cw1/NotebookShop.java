package Cw1;

public class NotebookShop {
    public static void main(String[] args) {

        DataStore dataStore = new DataStore();
        Computer computer = new Computer("Toshiba", 2019);
        Computer computer1 = new Computer("Toshiba", 2019);
        Computer computer2 = new Computer("Lenovo", 2016);
        Computer computer3 = new Computer("Msi", 2020);
        Computer computer4 = new Computer("Acer", 2017);

        dataStore.addComputer(computer);
        dataStore.addComputer(computer1);
        dataStore.addComputer(computer2);
        dataStore.addComputer(computer3);
        dataStore.addComputer(computer4);

        Computer compToFind = new Computer("Toshiba",2019);
        int computersFound = dataStore.checkAvailability(compToFind);
        System.out.println("Liczba komputerow: " + compToFind + " : " + computersFound);
        //System.out.println(dataStore.checkAvailability(computer1));

        System.out.println(dataStore.checkStore());
    }
}
