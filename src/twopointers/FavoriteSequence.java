package twopointers;

import java.util.Scanner;

public class FavoriteSequence {
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
            int j = n-1;
            while(i<j){
                System.out.print(arr[i]+" "+arr[j]+" ");
                i++;
                j--;
            }
            if(i==j){
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}
