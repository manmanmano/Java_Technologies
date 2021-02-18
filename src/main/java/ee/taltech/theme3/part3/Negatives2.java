package ee.taltech.theme3.part3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Negatives2 {

    //todo 103.1 fix the tests and add logic
    // this combines lesson2.part2 BiggestElement and lesson2.part6 Negatives
    // remember that biggest negative is the one closest to zero as -10 is bigger than -100
    // here is another design decision where we return null on nothing
    public static Integer biggestNegative(List<Integer> numbers){
        if (numbers == null) {
            return null;
        }
        return numbers.stream()
                .filter(e -> e < 0)
                .max(Integer::compareTo)
                .orElse(null);
    }

    //todo 103.2 add tests and add logic
    // this combines lesson2.part2 SumOfElements and lesson2.part6 Negatives
    // here it's up to you what do you want to return on null and what to return on no negatives, zero? Optional?
    public static Optional<Integer> sumOfNegatives(List<Integer> numbers){
        if (numbers == null) {
            return Optional.empty();
        }
        List<Integer> negatives = numbers.stream()
                .filter(e -> e < 0)
                .collect(Collectors.toUnmodifiableList());
        if (negatives.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(negatives.stream()
                .reduce(0, Integer::sum));
    }
}
