package greedy;

import java.util.Scanner;

public class WonderfulSticks {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int numberOfSticks = obj.nextInt();
            String rule = obj.next();

            int min = 1;
            int max = numberOfSticks;
            int[] sticksOrder = new int[numberOfSticks];
            int idxForSticksOrder = 0;
            for (int i = rule.length() - 1; i >= 0; i--) {
                char currRule = rule.charAt(i);
                if (currRule == '<') {
                    sticksOrder[idxForSticksOrder] = min;
                    min++;
                } else {
                    sticksOrder[idxForSticksOrder] = max;
                    max--;
                }
                idxForSticksOrder++;
            }
            sticksOrder[idxForSticksOrder] = min;
            for (int i = sticksOrder.length - 1; i >= 0; i--) {
                System.out.print(sticksOrder[i] + " ");
            }
            System.out.println();
        }
    }
}
