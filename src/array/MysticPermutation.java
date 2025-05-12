package array;

import java.util.Arrays;
import java.util.Scanner;

public class MysticPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
            }
            int[] newArr = Arrays.copyOf(arr,n);
            Arrays.sort(newArr);

            for(int i = 0; i < n; i++) {
                if(newArr[i] == arr[i]) {
                    if(i== n-1 && i-1 >=0){
                        swap(newArr,i,i-1);
                    }else if( i+1 <n){
                        swap(newArr,i+1,i);
                    }else{
                        newArr[i] = -1;
                    }
                }

            }
            for(int ele : newArr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
