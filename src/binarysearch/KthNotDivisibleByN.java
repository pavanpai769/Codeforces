package binarysearch;

import java.util.Scanner;

public class KthNotDivisibleByN {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t= obj.nextInt();

        while(t-- > 0){
            int n = obj.nextInt();
            int k = obj.nextInt();
            System.out.println(getKthNotDivisibleByN(n,k));
        }

    }

    private static long getKthNotDivisibleByN(int n, int k) {
        long low =0;
        long high = (long)10e13;
        long ans =0;
        while (low <= high) {

            long mid = low + (high - low)/2;
            long count = mid - mid/n;


           if(count >= k){
               ans = mid;
               high = mid-1;
           } else{
               low = mid+1;
           }
        }
        return ans;
    }
}
