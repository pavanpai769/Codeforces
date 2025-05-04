package slidingwindow;

import java.util.Scanner;

public class BlackAndWhiteStripes {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int k = obj.nextInt();
            String s = obj.next();

            int ans = Integer.MAX_VALUE;
            int i=0;
            int j =k-1;

            int countBlack = 0;

            for(i=0;i<=j;i++){
                if(s.charAt(i)=='B'){
                    countBlack++;
                }
            }
            i=0;
            while(j < n){
                ans = Math.min(ans,k-countBlack);
                if(s.charAt(i)=='B'){
                    countBlack--;
                }
                i++;
                j++;
                if(j<n && s.charAt(j)=='B'){
                    countBlack++;
                }
            }
            ans = Math.min(ans,k-countBlack);
            System.out.println(ans);
        }
    }
}
