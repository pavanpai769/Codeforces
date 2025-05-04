package twopointers;

import java.util.Scanner;

public class Rebellion {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int[] arr = new int[n];
            int prev = -1;
            boolean isNonDecreasing = true;
            for (int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
                if(arr[i] < prev) {
                    isNonDecreasing = false;
                }
                prev = arr[i];
            }
            if(isNonDecreasing) {
                System.out.println(0);
            }else{

                int i=0;
                int j = n-1;

                int ans =0;
                while(i<j) {

                    while(i<n && arr[i] !=1) i++;
                    while(j>=0 && arr[j]!=0) j--;

                    if(i>=j) break;

                    ans++;
                    i++;
                    arr[j] = 1;
                }

                System.out.println(ans);
            }
        }
    }
}
