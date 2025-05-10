package array;

import java.util.Arrays;
import java.util.Scanner;

public class InterestingSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[n-1]+arr[n-2]-arr[0]-arr[1]);
        }
    }
}
