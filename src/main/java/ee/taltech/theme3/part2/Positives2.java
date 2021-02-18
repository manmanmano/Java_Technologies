package ee.taltech.theme3.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Positives2 {


    //todo 102.1 fix tests and add logic
    // let's go back to lesson2.part5, however this time let's use streams
    // on null throw exception
    public static List<Integer> removeNegatives(List<Integer> numbers) {
        if (numbers == null)
            throw new IllegalArgumentException("invalid input");
//        List<Integer> positives = new ArrayList<>();
//        for (Integer number : numbers) {
//            if (number >= 0)
//                positives.add(number);
//        } - same as stream
        return numbers.stream()
                .filter(number -> number >= 0)
                .collect(Collectors.toList());
    }

    //todo 102.3 add tests and add logic
    // now we add lesson2.part4 to the mix, however sorting exists on the stream as well
    public static List<Integer> removeNegativesSortAsc(List<Integer> numbers) {
        if (numbers == null)
            throw new IllegalArgumentException("invalid input");
        return numbers.stream()
                .filter(number -> number >= 0)
                .sorted()
                .collect(Collectors.toList());
    }

    //todo 102.5 fix tests and add logic
    // We are returning Optional here.
    // Remember on SumOfElements/SumOfElementsTest we had to make a decision what to return.
    // This is somewhat similar. This time lecturer has decided to return Optional instead.
    public static Optional<Integer> firstPositive(List<Integer> numbers) {
        if (numbers == null)
            throw new IllegalArgumentException("invalid input");
//          return Optional.emtpy();
        return numbers.stream()
                .filter(number -> number >= 0)
                .findFirst();
    }
}
