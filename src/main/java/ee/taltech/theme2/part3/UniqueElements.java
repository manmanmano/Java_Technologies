package ee.taltech.theme2.part3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueElements {

    //todo 13.1 fix tests and add logic
    // if you can do it in 1 line, then pro -.-
    public static List<Integer> removeDuplicates(List<Integer> numbers){
        return numbers.isEmpty()? numbers : new ArrayList<>(new HashSet<>(numbers));
    }

}
