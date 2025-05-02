package twopointers;

import java.util.Scanner;
public class LongLong {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
            }

            int i=0;
            long currSum = Integer.MIN_VALUE;
            int operations=0;
            long sum =0;
            while(i<n){
                if(arr[i] < 0){
                    while( i<n && arr[i]*-1+currSum >= currSum ){
                        currSum += arr[i]*-1;
                        sum+= arr[i]*-1;
                        i++;
                    }
                    operations++;
                }else{
                    sum += arr[i];
                    i++;
                }
            }
            System.out.println(sum+" "+operations);

        }
    }
}
