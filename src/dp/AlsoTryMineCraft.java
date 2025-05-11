package dp;

import java.util.Scanner;

public class AlsoTryMineCraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberOfQueries = sc.nextInt();
        int[] height = new int[n];
        long[] prefix = new long[n];
        prefix[0] = 0;
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            if(i != 0){
                if(height[i] > height[i-1]){
                    prefix[i] = prefix[i-1];
                }else{
                    prefix[i] = prefix[i-1] + height[i-1]-height[i];
                }
            }
        }

        long[] suffix = new long[n];
        suffix[n - 1] = 0;
        for (int i = n-2 ; i >= 0; i--) {
            if(height[i] > height[i+1]){
                suffix[i] = suffix[i+1];
            }else{
                suffix[i] = suffix[i+1] + height[i+1]-height[i];
            }
        }

        while(numberOfQueries-- > 0){
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(getMinDamage(i,j,prefix,suffix));
        }
    }

    private static long getMinDamage(int i, int j, long[] prefix, long[] suffix) {
        if(i > j){
            return suffix[j-1]-suffix[i-1];
        }
        return prefix[j-1]-prefix[i-1];
    }
}
