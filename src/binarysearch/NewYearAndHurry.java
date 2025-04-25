package binarysearch;

import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfProblems = obj.nextInt();
        int minuteRequiredToReachParty = obj.nextInt();
        int totalMinuteHurryHasToSolveProblem  = 240 -  minuteRequiredToReachParty;
        int min =0;
        int max = numberOfProblems;

        while(min <= max){

            int mid = (min+max)/2;
            if(canHurrySolveMidNUmberOfQuestions(mid,totalMinuteHurryHasToSolveProblem)){
                min = mid+1;
            } else{
                max = mid-1;
            }
        }
        System.out.println(max);
    }

    private static boolean canHurrySolveMidNUmberOfQuestions(int mid, int totalMinuteHurryHasToSolveProblem) {
        int totalTimeRequiredToSolveQuestions = 5*(mid*(mid+1)/2);
        return totalTimeRequiredToSolveQuestions <= totalMinuteHurryHasToSolveProblem;
    }
}
