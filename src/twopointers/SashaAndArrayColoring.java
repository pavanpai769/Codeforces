package twopointers;

import java.util.Arrays;
import java.util.Scanner;

public class SashaAndArrayColoring {
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

            int i= 0;
            int j = arr.length - 1;

            int totalCost =0;
            while(i<j){
                totalCost += (arr[j]-arr[i]);
                i++;
                j--;
            }
            System.out.println(totalCost);
        }
    }
}
