package math;

import java.util.Scanner;

public class Legs {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-->0){
            int legs = obj.nextInt();
            int min =0;

            int maxNumberOfCowsYouCanHave = legs /4;

            min = maxNumberOfCowsYouCanHave + (legs - (maxNumberOfCowsYouCanHave*4)) /2;

            System.out.println(min);
        }
    }
}
