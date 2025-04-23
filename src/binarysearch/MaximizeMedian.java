package binarysearch;

import java.util.Scanner;

public class MaximizeMedian {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-->0){

            int numberOfElements = obj.nextInt();
            int sumOfElements = obj.nextInt();

            int medianIdx = (numberOfElements-1)/2;
            int numberOfElementsAfterMid = numberOfElements-medianIdx;

            int min =0;
            int max =sumOfElements;

            while(min <= max){
                int mid = min+(max-min)/2;
                long sumOfElementsAfterMid = (long)mid*numberOfElementsAfterMid;
                if(sumOfElementsAfterMid > sumOfElements){
                    max = mid-1;
                } else{
                    min = mid+1;
                }
            }
            System.out.println(max);
        }
    }
}
