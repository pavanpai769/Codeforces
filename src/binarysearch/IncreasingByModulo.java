package binarysearch;

import java.util.Scanner;

public class IncreasingByModulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0, right = m;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (isPossible(mid,arr,m)) {
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }

    static boolean isPossible(long maxOps,int[] arr,int m) {
        long prev = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= prev) {
                long k = m-arr[i]+prev;
                if(k > maxOps){
                    prev = arr[i];
                }
            } else {
                long k = prev - arr[i];
                if(k > maxOps){
                    return false;
                }
            }
        }
        return true;
    }
}
