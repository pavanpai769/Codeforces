package heap;

import java.util.Scanner;

public class Advantage {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int[] arr = new int[n];
            int firstMax =  Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
                if(arr[i] > firstMax ) {
                   secondMax = firstMax;
                   firstMax = arr[i];
                }else if ( arr[i] > secondMax ) {
                    secondMax = arr[i];
                }
            }
            if(secondMax == Integer.MIN_VALUE) {
                secondMax = firstMax;
            }
            for(int i = 0;i< n;i++){
                if(arr[i] < firstMax){
                    System.out.print(arr[i]-firstMax + " ");
                }else{
                    System.out.print(arr[i]-secondMax+ " ");
                }
            }
            System.out.println();
        }
    }
}
