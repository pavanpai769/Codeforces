package string;

import java.util.Scanner;

public class NotQuiteAPalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();

        while (numberOfTestCases-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int numberOfZero =0;
            int numberOfOne = 0;

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='0'){
                    numberOfZero++;
                }else{
                    numberOfOne++;
                }
            }

            for(int i = 0; i < k; i++) {
                if(numberOfZero > numberOfOne && numberOfZero > 1){
                    numberOfZero -= 2;
                }else{
                    numberOfOne -= 2;
                }
            }

            if(numberOfOne == numberOfZero || numberOfOne == numberOfZero+1 ||  numberOfZero == numberOfOne+1) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
