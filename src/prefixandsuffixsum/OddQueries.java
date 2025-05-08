package prefixandsuffixsum;

import java.util.Scanner;

public class OddQueries {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int numberOfElements = obj.nextInt();
            int numberOfQueries = obj.nextInt();

            long[] prefix = new long[numberOfElements+1];

            prefix[0] = 0;
            for (int i = 1; i <= numberOfElements; i++) {
                prefix[i] = prefix[i-1] + obj.nextInt();
            }

            for(int i=0; i<numberOfQueries; i++){
                int l = obj.nextInt();
                int r = obj.nextInt();
                int replace = obj.nextInt();

                long sumOfAllReplacedElement = (long) (r - l + 1) *replace;

                long sumOfElementsInTheRangeBeforeReplace = prefix[r] - prefix[l-1];

                long sumOfArrayAfterReplacement = (prefix[numberOfElements] - sumOfElementsInTheRangeBeforeReplace)+sumOfAllReplacedElement;

                System.out.println(sumOfArrayAfterReplacement%2 != 0 ? "YES" : "NO");
            }
        }
    }

}
