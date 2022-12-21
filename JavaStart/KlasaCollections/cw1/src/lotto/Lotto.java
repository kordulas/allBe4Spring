package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {

    public static final int NO_OF_NUMBERS = 49;
    public static final int MAX_NUMBERS = 6;

    private List<Integer> numbers = new ArrayList<>();
    private List<Integer> results;

    public Lotto() {
        generate();
        randomize();
    }

    public List<Integer> getResults() {
        return results;
    }

    void generate(){
        for (int i = 1; i <= NO_OF_NUMBERS ; i++) {
            numbers.add(i);
        }
    }
    void randomize(){
        Collections.shuffle(numbers);
        results = numbers.subList(0,6);
    }

    int checkResults(List<Integer> userNumbers){
        int counter = 0;
        for (int i = 0; i < MAX_NUMBERS; i++) {
            if(results.contains(userNumbers.get(i)))
                counter++;
        }
        return counter;
    }
}
