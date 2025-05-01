package twopointers;

import java.util.Scanner;

public class RakhshsRevival {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-->0){
            int n = obj.nextInt();
            int m = obj.nextInt();
            int k = obj.nextInt();
            String rakhsh = obj.next();
            int ans =0;
            int l=0, r =0;
            while (l < n && r < n) {
                if (rakhsh.charAt(l) == '1') {
                    l++;
                    r++;
                    continue;
                }
                if (r - l +1== m) {
                    ans++;
                    l = r + k;
                    r = l;
                    continue;
                }
                while (r < n && rakhsh.charAt(r) == '0' && r - l + 1 < m) {
                    r++;
                }
                if(r<n && rakhsh.charAt(r)=='1'){
                    l= r+1;
                    r=l;
                    continue;
                }
                if (r - l == m) {
                    ans++;
                    l = r + k;
                    r = l;
                }
            }

            System.out.println(ans);
        }
    }
}
