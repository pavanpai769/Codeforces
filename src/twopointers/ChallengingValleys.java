package twopointers;

import java.util.Scanner;

public class ChallengingValleys {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
            }
            int prev = arr[0];
            String ans = "Yes";
            for (int i = 1; i < n; i++) {
                if(arr[i] > prev) {
                   ans = isNonDecreasing(arr,i,n);
                   break;
                }
                prev = arr[i];
            }
            System.out.println(ans);
        }
    }

    private static String isNonDecreasing(int[] arr, int l, int r) {
        int prev = arr[l];
        for(int i = l+1; i < r; i++) {
            if(prev > arr[i]) {
                return "No";
            }
            prev = arr[i];
        }
        return "Yes";
    }
}
