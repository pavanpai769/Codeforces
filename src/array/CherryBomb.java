package array;

import java.util.*;

public class CherryBomb {

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        Integer s = null;

        for (int i = 0; i < n; i++) {
            if (b[i] != -1) {
                if (s == null) {
                    s = a[i] + b[i];
                } else if (s != a[i] + b[i]) {
                    System.out.println(0);
                    return;
                }
            }
        }

        if (s == null) {
            Arrays.sort(a);
            int mx = a[n - 1] - a[0];
            System.out.println(k - mx + 1);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (a[i] > s || s - a[i] > k) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
