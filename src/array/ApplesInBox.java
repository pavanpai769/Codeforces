package array;

import java.util.Arrays;
import java.util.Scanner;

public class ApplesInBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] apples = new int[n];

            for (int i = 0; i < n; i++) {
                apples[i] = sc.nextInt();
            }

            long totalApples = Arrays.stream(apples).sum();
            Arrays.sort(apples);
            apples[n-1]--;
            Arrays.sort(apples);
            if( apples[n-1]- apples[0] > k){
                System.out.println("Jerry");
                continue;
            }
            if(totalApples % 2 == 0){
                System.out.println("Jerry");
            }else{
                System.out.println("Tom");
            }
        }
    }
}
