package prefixandsuffix;

import java.util.Scanner;

public class LargerArraySegments {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-- > 0){
            int n = obj.nextInt();
            long k = obj.nextInt();
            long x = obj.nextLong();

            int[] arr = new int[n];
            long totalSum =0;
            for(int i = 0; i < n; i++){
                arr[i] = obj.nextInt();
                totalSum += arr[i];
            }

            if(totalSum*k < x){
                System.out.println(0);
                continue;
            }

            long l=1;
            long r = n*k;
            long ans =0;

            while(l<=r){
                long m = l+(r-l)/2;

                long countSuffixArray = (n*k -m+1)/n;
                int countSuffixElementsFromSingleArray = (int)((n*k-m+1)%n);

                long sum = countSuffixArray*totalSum;

                for(int i=n-countSuffixElementsFromSingleArray ; i<n;i++){
                    sum += arr[i];
                }
                if(sum <x ){
                    r = m-1;
                }else{
                    ans = m;
                    l= m+1;
                }

            }
            System.out.println(ans);
        }
    }

}
