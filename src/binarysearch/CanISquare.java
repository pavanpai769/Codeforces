package binarysearch;

import java.util.Scanner;

public class CanISquare {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();

        while (numberOfTestCases-- > 0){
            int numberOfbuckets = obj.nextInt();

            long sumOfSquares= 0;
            for(int i = 0; i < numberOfbuckets; i++){
                sumOfSquares+=obj.nextInt();
            }

            if(canISquare(sumOfSquares)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
    private static boolean canISquare(long sumOfbuckets){

        long min =1;
        long max = sumOfbuckets;
        while(min<=max){

            long mid = min + (max-min)/2;

            if(mid == sumOfbuckets/(double)mid){
                return true;
            }
            else if(mid < sumOfbuckets/mid){
                min = mid+1;
            } else{
                max = mid-1;
            }
        }
        return false;
    }
}
