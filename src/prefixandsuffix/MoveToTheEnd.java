package prefixandsuffix;

import java.util.Scanner;

public class MoveToTheEnd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int[] numbers = new int[n];
            int[] max = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = obj.nextInt();
                if( i== 0){
                    max[i] = numbers[0];
                }else{
                    max[i] = Math.max(numbers[i], max[i-1]);
                }
            }
            long sum = 0;
            for(int i = numbers.length-1; i >= 0; i--){
                System.out.print(sum+max[i]+" ");
                sum += numbers[i];
            }
            System.out.println();
        }
    }
}
