package cw1;

public class Main {
    public static void main(String[] args) {

        Sortable sorter = new Sortable() {
            @Override
            public void sort(int[] tab1) {
                int temp = 0;
                for(int i = 0; i < tab1.length;i++){
                    for (int j = 1; j < tab1.length -i; j++) {
                        if(tab1[j -1] > tab1[j]){
                            temp = tab1[j];
                            tab1[j] = tab1[j-1];
                            tab1[j-1] = temp;
                        }
                    }
                }
            }
        };

        int[] array = {2,123,4324,43,324,193,123,352,36,567,345,214};
        wyswietlElementy(array);
        sorter.sort(array);
        wyswietlElementy(array);
    }

    static void wyswietlElementy(int[] array){
        for(int tab : array){
            System.out.print(tab + " ");
        }
        System.out.println(" ");
    }
}
