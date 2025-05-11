package array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemovePrefix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        Set<Integer> set = new HashSet<>();
        while(numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
            }
            int i= n-1;
            for(i= n-1; i >= 0; i--) {
                if(set.contains(arr[i])) {
                    break;
                }
                set.add(arr[i]);
            }
            System.out.println(i+1);
            set.clear();
        }
    }
}
