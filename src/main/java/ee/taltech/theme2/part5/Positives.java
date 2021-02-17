package ee.taltech.theme2.part5;

import java.util.ArrayList;
import java.util.List;

public class Positives {

    //todo 15.1 fix tests and add logic
    // sometimes you are tired of validating inputs and instead throw an IllegalArgumentException
    public static List<Integer> removeNegatives(List<Integer> numbers) {
        if (numbers == null){
            throw new IllegalArgumentException("invalid input");
        }
        List<Integer> positives = new ArrayList<>();
        for (Integer number : numbers) {
            if (number >= 0){
                positives.add(number);
            }
        }
        return positives;
    }
}
