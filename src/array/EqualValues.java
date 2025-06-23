package array;

import java.util.*;

public class EqualValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();

            int curr = sc.nextInt();
            int consecutiveFrequency = 1;
            int i =1;

            long minCost = Long.MAX_VALUE;

            while( i < n){
                int in = sc.nextInt();
                if(in == curr){
                    consecutiveFrequency++;
                }else{
                    long currentCost = (long)(n-consecutiveFrequency)*curr;
                    minCost = Math.min(minCost, currentCost);
                    consecutiveFrequency = 1;
                    curr = in;
                }
                i++;
            }
            long currentCost = (long)(n-consecutiveFrequency)*curr;
            minCost = Math.min(minCost, currentCost);
            System.out.println( minCost);
        }
    }
}
