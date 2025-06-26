package array;

import java.util.Arrays;
import java.util.Scanner;

public class WatsonAsksDoesPermutationExists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println(isPossible(arr, n));
        }
    }

    private static String isPossible(int[] arr, int n){

        Arrays.sort(arr);

        for(int i=0; i<n-1;i++){
            if(arr[i+1]- arr[i] > 1) return "NO";
        }

        return "YES";
    }
}
