package string;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateQueries {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int m = obj.nextInt();

            StringBuilder original = new StringBuilder(obj.next());

            int[] updateIndices = new int[m];
            for (int i = 0; i < m; i++) {
                updateIndices[i] = obj.nextInt();
            }

            char[] update = obj.next().toCharArray();

            Arrays.sort(updateIndices);
            Arrays.sort(update);

            int minCharIdx = 0;
            for (int i = 0; i < updateIndices.length; i++) {
                if((i+1 <m && updateIndices[i] == updateIndices[i+1] ) ){
                    continue;
                }
                original.setCharAt(updateIndices[i]-1, update[minCharIdx++]);
            }
            System.out.println(original);
        }
    }
}
