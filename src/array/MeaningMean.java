package array;

import java.util.Arrays;
import java.util.Scanner;

public class MeaningMean {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
            }
            Arrays.sort(arr);

            long prev = arr[0];
            for (int i = 1; i < n; i++) {
                prev = (prev+arr[i])/2;
            }
            System.out.println(prev);
        }
    }
}
