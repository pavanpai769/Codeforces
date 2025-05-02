package twopointers;

import java.util.Scanner;

public class ABFlipping {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            String str = obj.next();
            System.out.println(getMaxSwaps(n,str));
        }
    }
    private static int getMaxSwaps(int n, String str) {
        int unswappedAs = 0;
        int ans = 0;
        int i=0;
        while(i<str.length()) {
            if(str.charAt(i)=='A') {
                unswappedAs++;
                i++;
            }else{
                if(unswappedAs == 0){
                    i++;
                    continue;
                }
                int numberOfBs =0;
                while(i<str.length() && str.charAt(i)=='B') {
                    numberOfBs++;
                    i++;
                }
                ans += (unswappedAs - 1)+numberOfBs;
                unswappedAs = 1;
                if(i== str.length()) {
                    break;
                }
            }
        }
        return ans;
    }
}
