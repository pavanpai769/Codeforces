package twopointers;

import java.util.Arrays;
import java.util.Scanner;

public class QualityVsQuantity {
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

            int redCount =0, blueCount = 1;
            long redSum =0, blueSum = arr[0];
            int i=1;
            int j = n-1;
            boolean isPossible = false;
            while(i<j){
                redSum+=arr[j];
                blueSum+=arr[i];

                redCount++;
                blueCount++;

                if(redSum> blueSum && redCount < blueCount){
                    isPossible = true;
                    break;
                }
                j--;
                i++;
            }
            System.out.println(isPossible ? "Yes" : "No");
        }
    }
}

