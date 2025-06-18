package array;

import java.util.Arrays;
import java.util.Scanner;

public class KevinAndPermutation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (t-- > 0) {
            int n = obj.nextInt();
            int k = obj.nextInt();

            int[] arr = new int[n];

            int max = n;
            int min = 1;
            for (int i = 0; i < n; i++) {
                if((i+1)%k == 0){
                    arr[i] = min++;
                }else{
                    arr[i] = max--;
                }
            }

            for(int ele : arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
