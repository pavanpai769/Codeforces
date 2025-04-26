package binarysearch;

import java.util.Scanner;

public class SportMafia {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfActions = obj.nextInt();
        int remainingCandiesAtTheEnd = obj.nextInt();

        int min =0;
        int max = numberOfActions;

        while(min <= max){

            int mid = min+(max-min)/2;

            int numberOfActionsWhereShePutCandies = numberOfActions-mid;
            long totalNUmberOfCandiesInBox = numberOfActionsWhereShePutCandies*((long)numberOfActionsWhereShePutCandies+1)/2;

            long remainingCandiesAfterEatingMidNumberOfCandies = totalNUmberOfCandiesInBox-mid;

            if(remainingCandiesAfterEatingMidNumberOfCandies == (long)remainingCandiesAtTheEnd){
                System.out.println(mid);
                break;
            } else if( remainingCandiesAfterEatingMidNumberOfCandies > remainingCandiesAtTheEnd){
                min = mid+1;
            } else{
                max = mid-1;
            }
        }
    }
}
