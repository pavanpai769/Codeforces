package array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NeedMoreArrays {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        while (numberOfTestCases-- > 0){

            int n = sc.nextInt();
            int countArrays =0;
            int prev =-1;
            for(int i = 0; i < n; i++){
                int curr = sc.nextInt();
                if(prev+1 != curr && prev != curr){
                    countArrays++;
                    prev = curr;
                }
            }

            System.out.println(countArrays);
        }
    }
}
