package array;

import java.util.Arrays;
import java.util.Scanner;

public class ThePickyCat {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0){
            int n= obj.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = Math.abs(obj.nextInt());
            }

            int firstEle = arr[0];
            Arrays.sort(arr);

            int countEleBeforeFirst = 0;
            for(int i=0;i<n;i++){
                if(arr[i]< firstEle){
                    countEleBeforeFirst++;
                }
            }

            if(countEleBeforeFirst <= n/2){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
