package twopointers;

import java.util.Scanner;

public class CipherShifter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            String a = obj.next();
            int i= 0;
            int j=0;
            StringBuilder decoded = new StringBuilder();
            while(j < a.length()) {
                j=i+1;
                while(j < a.length() && a.charAt(j) != a.charAt(i)) {
                    j++;
                }
                if(j >= a.length()) {
                    break;
                }
                decoded.append(a.charAt(i));
                i= j+1;
            }
            System.out.println(decoded);
        }

    }
}
