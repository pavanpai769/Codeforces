package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Meximization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if(i!= 0 && arr[i] == arr[i-1]) {
                    continue;
                }
                list.add(arr[i]);
            }
            for(int i = 0; i < n; i++) {
                if(i!= 0 && arr[i] == arr[i-1]) {
                    list.add(arr[i]);
                }
            }
            list.forEach(i->System.out.print(i+" "));
            System.out.println();
        }
    }
}
