package array;

import java.util.Scanner;

public class OddSwapSort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {

            boolean isPossible = true;

            int n = obj.nextInt();

            int lastMaxOdd = 0;
            int lastMaxEven = 0;
            for (int i = 0; i < n; i++) {
                int num = obj.nextInt();
                if(!isPossible)  continue;
                if (num % 2 == 0) {
                    if(num >= lastMaxEven) lastMaxEven = num;
                    else isPossible = false;
                }
                else {
                    if(num >= lastMaxOdd) lastMaxOdd = num;
                    else isPossible = false;
                }
            }
            System.out.println(isPossible ? "YES" : "NO");
        }
    }
}
