package ee.taltech.theme1.part4;

public class SumCalculator {

    //todo 4.1 this is one with tests, make tests work

    public static int sum(int x1, int x2) {
        return x1 + x2;
    }

    public static int sumAbsolute(int x1, int x2) {
        return Math.abs(x1) + Math.abs(x2);
    }

    public static Integer sumObjects(Integer x1, Integer x2) {
        if (x1 == null)
            return x2;
        else if (x2 == null){
            return x1;
        }
        return x1 + x2;
    }
}
