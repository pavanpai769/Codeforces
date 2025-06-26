package math;

import java.util.Scanner;

public class Perfecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();

            long sumOfN = n*(n+1)/2;
            if(isPerfectSquare(sumOfN)){
                System.out.println(-1);
            }else{
                long currSum = 0;
                for(int i = 1; i < n; i++) {
                    currSum += i;
                    if (isPerfectSquare(currSum)) {
                        System.out.print((i + 1) + " " + (i)+" ");
                        currSum += i + 1;
                        i++;
                    }else {
                        System.out.print(i+ " ");
                    }
                    System.out.println();
                }
            }

        }
    }

    private static boolean isPerfectSquare(long n){

        long sqrt = (long) Math.sqrt(n);

        return sqrt * sqrt == n;
    }
}
