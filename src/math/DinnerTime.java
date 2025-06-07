package math;

import java.util.Scanner;

public class DinnerTime {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-->0){
            int n = obj.nextInt();
            int totalSum = obj.nextInt();
            int p = obj.nextInt();
            int sumOfPConsecutive = obj.nextInt();

            int numberOfPartitionsOfSizeP = n/p;
            int remainingEle = n%p;

            if(remainingEle==0){
                System.out.println(numberOfPartitionsOfSizeP*sumOfPConsecutive == totalSum ? "Yes":"No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}
