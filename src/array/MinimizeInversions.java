package array;

import java.util.Arrays;
import java.util.Scanner;
public class MinimizeInversions {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-- > 0){
            int n = obj.nextInt();
            int[][] arr = new int[n][2];
            for(int i = 0; i < n; i++){
                arr[i][0] = obj.nextInt();
            }
            for(int i = 0; i < n; i++){
                arr[i][1] = obj.nextInt();
            }

            Arrays.sort(arr, (a, b)->a[0]-b[0]);

            for(int i = 0; i < n; i++){
                System.out.print(arr[i][0]+" ");
            }
            System.out.println();
            for(int i=0;i<n;i++){
                System.out.print(arr[i][1]+" ");
            }
            System.out.println();
        }
    }
}
