package twopointers;

import java.util.*;

public class VeryDifferentArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            Integer[] a = new Integer[n];
            Integer[] b = new Integer[m];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();

            Arrays.sort(a);
            Arrays.sort(b, Collections.reverseOrder());

            Integer[] c = new Integer[n];
            long s = 0;

            for (int i = 0; i < n; i++) {
                c[i] = b[m - n + i];
                s += Math.abs(c[i] - a[i]);
            }

            long res = s;
            for (int k = 0; k < n; k++) {
                s -= Math.abs(c[k] - a[k]);
                c[k] = b[k];
                s += Math.abs(c[k] - a[k]);
                res = Math.max(res, s);
            }
            System.out.println(res);
        }
    }

}

