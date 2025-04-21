package binarysearch;

import java.util.Scanner;

public class ProgrammersAndMathematicians {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-->0){
            int programmers = obj.nextInt();
            int mathematicians = obj.nextInt();

            int min = 0;
            int max = Math.min(programmers,mathematicians);

            while(min<=max){
                int mid = min+(max-min)/2;
                if(canYouCreateMidNumberOfTeams(programmers,mathematicians,mid)){
                    min = mid+1;
                }else{
                    max = mid-1;
                }
            }
            System.out.println(max);
        }
    }

    private static boolean canYouCreateMidNumberOfTeams(int programmers, int mathematicians, int mid) {
        int programmersLeft = programmers-mid;
        int mathematicianLeft = mathematicians-mid;

        if(programmersLeft+mathematicianLeft >= 2*mid){
            return true;
        }
        return false;
    }
}
