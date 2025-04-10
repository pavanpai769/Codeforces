package binarysearch;

import java.util.Scanner;
public class PipeLine {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        long numberOfHouses = obj.nextLong();
        long numberOfSplitters = obj.nextLong();
        System.out.println(getMinSplitters(numberOfHouses, numberOfSplitters));

    }

    private static long getMinSplitters(long numberOfHouses, long numberOfSplitters){
        if(numberOfSplitters==1){
            return 0;
        }
        if(getMaxOutputForNSplitters(numberOfSplitters) < numberOfHouses){
            return -1L;
        }
        long min = 1L;
        long max = numberOfSplitters-1;
        while(min<=max){
            long mid = min+(max-min)/2;
            long maxNumberOfOutput = getMaxOutputForNSplitters(numberOfSplitters)-getMaxOutputForNSplitters(numberOfSplitters-mid)+1;
            if(maxNumberOfOutput>=numberOfHouses){
                max = mid-1;
            } else{
                min = mid+1;
            }
        }
        return min;
    }


    private static long getMaxOutputForNSplitters(long n) {
        return n*(n+1)/2 -(n-1);
    }

}
