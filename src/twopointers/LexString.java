package twopointers;

import java.util.Arrays;
import java.util.Scanner;

public class LexString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int m = obj.nextInt();
            int k = obj.nextInt();

            String a = obj.next();
            String b = obj.next();

            char[] strA  = a.toCharArray();
            char[] strB  = b.toCharArray();

            Arrays.sort(strA);
            Arrays.sort(strB);

            int i=0;
            int j=0;

            int rowCountOfA =0;
            int rowCountOfB =0;

            StringBuilder ans = new StringBuilder();
            while(i<strA.length && j<strB.length) {
                if(rowCountOfA < k && strA[i] < strB[j]) {
                    ans.append(strA[i]);
                    rowCountOfA++;
                    rowCountOfB=0;
                    i++;
                }else if(rowCountOfB < k) {
                    ans.append(strB[j]);
                    rowCountOfB++;
                    rowCountOfA=0;
                    j++;
                }else{
                    if(rowCountOfA < k) {
                        ans.append(strA[i]);
                        rowCountOfA++;
                        rowCountOfB=0;
                        i++;
                    }else{
                        ans.append(strB[j]);
                        rowCountOfB++;
                        rowCountOfA=0;
                        j++;
                    }
                }
            }
            System.out.println(ans);
        }

    }

}
