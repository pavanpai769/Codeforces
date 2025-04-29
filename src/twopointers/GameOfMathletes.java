package twopointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GameOfMathletes {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long numberOfTestCases = obj.nextLong();
        while(numberOfTestCases-->0){
            int numberOfIntegers = obj.nextInt();
            int target = obj.nextInt();
            int[] numbers = new int[numberOfIntegers];
            for(int i=0;i<numberOfIntegers;i++){
                numbers[i] = obj.nextInt();
            }
            Arrays.sort(numbers);
            int score = 0;
            int i=0,j=numberOfIntegers-1;
            while(i<j){
                int sum = numbers[i]+numbers[j];
                if(sum ==target){
                    score++;
                    i++;
                    j--;
                }else if(sum>target){
                    j--;
                }else{
                    i++;
                }
            }
            System.out.println(score);
        }
    }
}
