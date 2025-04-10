package binarysearch;

import java.util.Scanner;

public class MikeAndChocolateThieves {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long m =  obj.nextLong();
        long min =0;
        long max = Long.MAX_VALUE;
        long ans = -1L;

        while(min <= max){
            long mid = min+(max-min)/2;
            long  noOfWays = countWays(mid);

            if(noOfWays == m){
                ans = mid;
                max = mid-1;
            } else if(noOfWays < m){
                min = mid+1;
            } else{
                max = mid-1;
            }
        }
        System.out.println(ans);

    }

    private static long countWays(long n) {
        long count = 0;
        for (long k = 2; k * k * k <= n; k++) {
            count += n / (k * k * k);
        }
        return count;
    }
}
