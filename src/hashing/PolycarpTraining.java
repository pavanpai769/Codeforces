package hashing;

import java.util.Arrays;
import java.util.Scanner;

public class PolycarpTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int problemsPerDay = 1;
        for(int i=0; i<n; i++){
            if(array[i] >= problemsPerDay){
                problemsPerDay++;
            }
        }
        System.out.println(problemsPerDay-1);
    }
}
