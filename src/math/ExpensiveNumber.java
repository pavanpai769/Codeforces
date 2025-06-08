package math;

import java.util.Scanner;

public class ExpensiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        while(numberOfTestCases-->0){
            String number = sc.next();

            int countRemovals = 0;

            boolean foundPositive = false;
            for(int i= number.length()-1;i>=0;i--){
                if(number.charAt(i) != '0'){
                    if(foundPositive){
                        countRemovals++;
                    }else{
                        foundPositive = true;
                    }
                }else{
                   if(!foundPositive){
                       countRemovals++;
                   }
                }
            }
            System.out.println(countRemovals);
        }
    }
}
