package array;

import java.util.Scanner;

public class NewBakery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (b <= a) {
                System.out.println(n * a);
            } else {
                long k = Math.min(b - a + 1, n);
                System.out.println((b - k + 1) * n + k * (k - 1) / 2);
            }
        }
    }

}
