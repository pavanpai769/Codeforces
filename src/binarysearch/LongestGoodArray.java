package binarysearch;

import java.util.Scanner;

public class LongestGoodArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int l = obj.nextInt();
            int r = obj.nextInt();

            int min = 0;
            int max = r-l+1;

            while(min<=max){
                int mid = min+(max-min)/2;

                long sum = (long) mid *(mid+1)/2;
                if(l+sum > r){
                    max = mid-1;
                } else{
                    min = mid+1;
                }
            }
            System.out.println(max+1);
        }
    }
}
