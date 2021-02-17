package ee.taltech.theme2.part4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorter {

    //todo 14.1 make tests work
    public static List<Integer> sortAsc(List<Integer> numbers){
        Collections.sort(numbers);
        return numbers;
    }

    public static List<Integer> sortDesc(List<Integer> numbers){
        List<Integer> mutableNumbers = new ArrayList<>(numbers);
        Collections.sort(mutableNumbers, Collections.reverseOrder());
        return numbers;
    }
}
