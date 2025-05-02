package twopointers;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ParitySort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();

        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int[] arr = new int[n];
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
                pq.offer(arr[i]);
            }

            if(canSort(arr,pq,n)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }

    private static boolean canSort(int[] arr, PriorityQueue<Integer> pq,int n){

        for(int i=0;i< n;i++){
            int currEle = pq.poll();
            if((arr[i]%2 == 0 && currEle%2 != 0) || (arr[i]%2 == 1 && currEle%2 != 1) ){
                return false;
            }
        }
        return true;
    }

}
