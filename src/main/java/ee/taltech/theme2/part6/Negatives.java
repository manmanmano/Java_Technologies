package ee.taltech.theme2.part6;

import java.util.List;

public class Negatives {

    //todo 16.1 add tests and add logic
    // sometimes you want to return more logic from your method than just a list of numbers
    // in that case in OOP world we use another Object to wrap around it
    public static CalculationResult removePositives(List<Integer> numbers) {
        long startTime = System.currentTimeMillis();
        if (numbers == null){
            return new CalculationResult(CalculationStatus.NO_CALC, null, null, duration(startTime));
        }
        return new CalculationResult(CalculationStatus.OK, numbers, numbers, duration(startTime));
    }
    private static long duration(long startTime){
        return System.currentTimeMillis() - startTime;
    }
}
