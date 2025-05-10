package hashing;

import java.util.*;

public class ThreeSevens {
    static final int MAX = 50000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] last = new int[MAX + 777];

        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt(); // Number of days
            List<List<Integer>> daysList = new ArrayList<>();

            Arrays.fill(last, 0);

            for (int day = 0; day < m; day++) {
                int n = sc.nextInt();
                List<Integer> a = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    last[x] = day;
                    a.add(x);
                }
                daysList.add(a);
            }

            int[] ans = new int[m];
            Arrays.fill(ans, -1);
            boolean failed = false;

            for (int day = 0; day < m; day++) {
                for (int x : daysList.get(day)) {
                    if (last[x] == day) {
                        ans[day] = x;
                        break;
                    }
                }
                if (ans[day] == -1) {
                    System.out.println(-1);
                    failed = true;
                    break;
                }
            }

            if (!failed) {
                for (int i = 0; i < m; i++) {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
