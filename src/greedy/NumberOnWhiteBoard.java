package greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class NumberOnWhiteBoard {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 1; i <= n; i++) {
                set.add(i);
            }

            List<int[]> ans = new ArrayList<>();
            while(set.size() != 1) {
                int a = set.pollLast();
                int b = set.pollLast();
                ans.add(new int[]{a, b});
                set.add(Math.ceilDiv(a+b,2));
            }

            System.out.println(set.pollLast());
            for(int[] a : ans) {
                System.out.println(a[0] + " " + a[1]);
            }
        }
    }
}
