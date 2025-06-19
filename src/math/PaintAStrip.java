package math;

import java.util.Scanner;

public class PaintAStrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int curr = 1;
            int ans = 1;
            while(curr < n){
                curr = (curr+1)*2;
                ans++;
            }
            System.out.println(ans);
        }
    }
}
