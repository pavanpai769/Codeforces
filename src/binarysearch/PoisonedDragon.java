package binarysearch;


import java.util.Scanner;

public class PoisonedDragon {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int numberOfTestCases = obj.nextInt();

        while( numberOfTestCases-->0) {
            int totalNumberOfHits = obj.nextInt();

            long dragonHits = obj.nextLong();

            long[] maxHitsBetweenIntervals = new long[totalNumberOfHits];
            long previousHit = 0;
            for (int i = 0; i < totalNumberOfHits; i++) {
                long currentHit = obj.nextInt();
                if (i == 0) {
                    previousHit = currentHit;
                    continue;
                }
                maxHitsBetweenIntervals[i - 1] = currentHit - previousHit;
                previousHit = currentHit;
            }
            maxHitsBetweenIntervals[maxHitsBetweenIntervals.length - 1] = Long.MAX_VALUE;

            System.out.println(getMinimumHits(totalNumberOfHits, dragonHits, maxHitsBetweenIntervals));
        }
    }

    public static long getMinimumHits(long totalNumberOfHits, long dragonHits, long[] maxHitsBetweenIntervals){
        if(totalNumberOfHits >= dragonHits){
            return 1L;
        }
        long min =1;
        long max = dragonHits;
        while(min<=max){
            long mid = min+(max-min)/2;
            long maximumHitsWithMid = 0;
            for(int i=0;i<maxHitsBetweenIntervals.length;i++){
                maximumHitsWithMid += Math.min(maxHitsBetweenIntervals[i],mid);
            }

            if(maximumHitsWithMid >=  dragonHits) {
                max = mid-1;
            } else{
                min = mid+1;
            }
        }
        return min;
    }
}
