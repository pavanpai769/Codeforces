package twopointers;

import java.util.Scanner;


public class ServalAndInversionMagic {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            String s = obj.next();
            int i=0;
            int j= n-1;
            while (i < j) {
                if (s.charAt(i) == s.charAt(j)) {
                    i++;
                    j--;
                }else{
                    break;
                }
            }
            if(i >= j){
                System.out.println("YES");
            }
            else{
                System.out.println(canCreatePalindrome(s.substring(i,j+1)));
            }
        }
    }

    private static String canCreatePalindrome(String str) {
        int i=0;
        int j=str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                i++;
                j--;
            }else{
                break;
            }
        }
        return isPalindrome(str.substring(i,j+1))? "YES":"NO";
    }

    private static boolean isPalindrome(String str) {
        int i=0;
        int j=str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
