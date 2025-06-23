package array;

import java.util.Arrays;
import java.util.Scanner;

public class WonderfulGloves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] left = new int[n];
            int[] right = new int[n];

            for(int i=0;i<n;i++) {
                left[i] = sc.nextInt();
            }

            for(int i=0;i<n;i++) {
                right[i] = sc.nextInt();
            }


            int [] min = new int[n];
            for(int i=0;i<n;i++) {
                min[i] = Math.min(left[i],right[i]);
            }

            Arrays.sort(min);
            long sum = 0;
            for(int i=0; i< (n-k+1);i++){
                sum+= min[i];
            }

            long totalLeftGloves = Arrays.stream(left).mapToLong(l->l).sum();
            long totalRightGloves = Arrays.stream(right).mapToLong(l->l).sum();

            System.out.println(totalLeftGloves+totalRightGloves-sum+1);
        }
    }
}
