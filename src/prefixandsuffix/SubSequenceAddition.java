package prefixandsuffix;

import java.util.Arrays;
import java.util.Scanner;

public class SubSequenceAddition {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int[] nums = new int[n];

            for(int i = 0; i < n; i++) {
                nums[i] = obj.nextInt();
            }

            Arrays.sort(nums);
            if(nums[0] != 1){
                System.out.println("No");
                continue;
            }

            long prefixSum = 1;

            boolean canGenerate = true;
            for(int i = 1; i < n; i++) {

                if(nums[i] > prefixSum) {
                    canGenerate = false;
                    break;
                }
                prefixSum += nums[i];
            }

            System.out.println(canGenerate?"YES":"NO");
        }
    }
}
