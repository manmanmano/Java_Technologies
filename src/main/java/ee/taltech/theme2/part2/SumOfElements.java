package ee.taltech.theme2.part2;

import java.util.List;

public class SumOfElements {

    //todo 12.2 fix the tests and add logic
    public static Integer sum(List<Integer> numbers){
        if (numbers.isEmpty() || numbers == null){
            throw new NullPointerException("no numbers");
        }
        Integer sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
