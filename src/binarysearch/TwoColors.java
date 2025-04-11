package binarysearch;

import java.util.*;

public class TwoColors {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while (t-- > 0) {
            int n = obj.nextInt();
            int m = obj.nextInt();
            int[] a = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = obj.nextInt();
            }

            Arrays.sort(a);
            long ans = 0;

            for (int k = 1; k < n; k++) {
                int part1 = k;
                int part2 = n - k;

                int i1 = lowerBound(a, part1);
                int count1 = m - i1;

                int i2 = lowerBound(a, part2);
                int count2 = m - i2;

                int iCommon = lowerBound(a, Math.max(part1, part2));
                int countCommon = m - iCommon;

                long validWays = (long)count1 * count2 - countCommon;
                ans += validWays;
            }

            System.out.println(ans);
        }
    }

    static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}
