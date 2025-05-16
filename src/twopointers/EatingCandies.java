package twopointers;

import java.util.Scanner;

public class EatingCandies {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int numberOfCandies = obj.nextInt();
            int[] candies = new int[numberOfCandies];
            for (int i = 0; i < numberOfCandies; i++) {
                candies[i] = obj.nextInt();
            }

            int i=0;
            int j = numberOfCandies - 1;

            long weightOfCandiesEatenByBob = 0;
            long weightOfCandiesEatenByAlice = 0;

            int numberOfCandiesEatenByBob = 0;
            int numberOfCandiesEatenByAlice = 0;

            int ans = 0;

            while(i <= j){
               if(weightOfCandiesEatenByAlice > weightOfCandiesEatenByBob){
                   weightOfCandiesEatenByBob += candies[j];
                   numberOfCandiesEatenByBob++;
                   j--;
               }else{
                   weightOfCandiesEatenByAlice += candies[i];
                   numberOfCandiesEatenByAlice++;
                   i++;
               }
                if(weightOfCandiesEatenByAlice == weightOfCandiesEatenByBob){
                    ans = numberOfCandiesEatenByBob+numberOfCandiesEatenByAlice;
                }
            }

            System.out.println(ans);
        }
    }
}
