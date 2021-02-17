package ee.taltech.theme1.part5;

import java.util.Scanner;

public class GroupDivisor {

    public static void main(String[] args) {
        //todo 5.1 using example in ScannerExample.java (copy code from there here and modify it)
        // ask user for number of people
        // ask user for group size
        // inform user about the number of groups and how many people are left over
        // left over can be done using modulo operator (google?)
        // https://4.bp.blogspot.com/-HEJLRkcu3pQ/Wh2A9kr8XwI/AAAAAAAAC9w/GmCMdBd7ekwWgLuoqTvS_DSoFeuhtUNcACEwYBhgL/s1600/not-sure-if-i-am-a-good-programming-or-good-at-googling.jpg
        Scanner reader = new Scanner(System.in);
        System.out.print("How many people?");
        int nPeople = reader.nextInt();
        System.out.println(nPeople + " people");
        System.out.print("Group size?");
        int gSize = reader.nextInt();
        System.out.println(gSize + " is the group size");
        int nGroups = nPeople / gSize;
        System.out.print(nGroups + " groups can be formed");
        int leftover = nPeople % nGroups;
        System.out.println(" and " + leftover + " people are left over");
        System.out.printf("%d groups can be formed and %d people are left over", nGroups, leftover);


    }
}
