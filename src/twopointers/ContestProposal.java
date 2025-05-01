package twopointers;

import java.util.Scanner;

public class ContestProposal {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-->0){
            int n = obj.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0;i<n;i++){
                a[i] = obj.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i] = obj.nextInt();
            }
            System.out.println(getMinProblems( a, b));
        }
    }

    private static int getMinProblems(int[] a, int[] b) {
        int low = 0;
        int ans =0;
        for(int i=0;i<a.length;i++){
            if(a[low]<=b[i]){
                low++;
            }else{
                ans++;
            }
        }
        return ans;
    }
}
