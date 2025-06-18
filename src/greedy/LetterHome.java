package greedy;

import java.util.Scanner;

public class LetterHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] homes = new int[n];
            for (int i = 0; i < n; i++) {
                homes[i]=sc.nextInt();
            }
            int first = homes[0];
            int last = homes[n-1];

            int stepsToGoFirstHome = x - first;
            int stepsToGoSecondHome = last - x;

            if (stepsToGoFirstHome <= 0) {
                System.out.println(stepsToGoSecondHome);
            } else if (stepsToGoSecondHome <= 0) {
                System.out.println(stepsToGoFirstHome);
            } else {
                System.out.println(Math.min(stepsToGoFirstHome, stepsToGoSecondHome) * 2 + Math.max(stepsToGoFirstHome, stepsToGoSecondHome));
            }
        }
    }
}
