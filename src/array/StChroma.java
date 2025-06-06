package array;

import java.util.Scanner;

public class StChroma {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int x= obj.nextInt();
            for(int i =0;i<n;i++) {
                if(i== x){
                    continue;
                }
                System.out.print(i+" ");
            }
            if(x < n){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
