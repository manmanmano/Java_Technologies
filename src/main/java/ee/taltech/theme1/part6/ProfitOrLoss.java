package ee.taltech.theme1.part6;

import java.util.Scanner;

public class ProfitOrLoss {

    public static void main(String[] args) {
        //todo 6.1 using example in ScannerExample.java (copy code from there here and modify it)
        // ask user for revenue
        // then ask user for cost
        // in the end print your verdict: profit, loss or break even
        System.out.print("Revenue: ");
        Scanner reader = new Scanner(System.in);
        int rev = reader.nextInt();
        System.out.println("Profit: " + rev);

        System.out.print("Cost: ");
        int cost = reader.nextInt();
        System.out.println("Cost: " + cost);

        decide(rev, cost);



        //todo 6.2 it would be cool if you had a method "decide" what takes in 2 numbers
        // and returns "profit", "loss" or "break even"
        // create tests for each usecase

        //todo 6.3 All done! Help others or try to improve on all of your previous solutions.
    }

    static String decide(int rev, int cost){
        if (rev > cost){
            return "PROFIT";
        } else if (cost > rev){
            return "LOSS";
        } else {
            return "BREAK EVEN";
        }
    }
}
