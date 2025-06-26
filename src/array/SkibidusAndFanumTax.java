package array;

import java.util.Scanner;

public class SkibidusAndFanumTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr = new int[n];


            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int b = sc.nextInt();
            System.out.println(isPossible(arr,b));

        }
    }


    private static String isPossible(int[] arr, int b){
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i-1] > arr[i]){
                arr[i-1] = b-arr[i-1];
                if(i-2 >= 0 && arr[i-1]< arr[i-2]){
                    return "No";
                }
                i--;
            }
        }
        return "Yes";
    }
}