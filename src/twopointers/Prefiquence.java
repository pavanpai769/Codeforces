package twopointers;

import java.util.Scanner;

public class Prefiquence {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int m = obj.nextInt();

            String str1 = obj.next();
            String str2 = obj.next();

            int i=0;
            int j=0;
            int ans =0;

            while(i<n && j<m) {
                if(str1.charAt(i)==str2.charAt(j)) {
                    ans++;
                    i++;
                }
                j++;
            }
            System.out.println(ans);
        }
    }
}
