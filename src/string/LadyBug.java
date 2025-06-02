package string;

import java.util.Scanner;

public class LadyBug {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            String str1 = obj.next();
            String str2 = obj.next();

            int countFirstZigZag = 0;
            int countSecondZigZag = 0;

            for (int i = 0; i < n; i++) {
                if(i%2 == 0){
                    if(str1.charAt(i)=='0'){
                        countFirstZigZag++;
                    }
                    if(str2.charAt(i)=='0'){
                        countSecondZigZag++;
                    }
                }else{
                    if(str1.charAt(i)=='0'){
                        countSecondZigZag++;
                    }
                    if(str2.charAt(i)=='0'){
                        countFirstZigZag++;
                    }
                }
            }
            int minForUpperPart = (n+1)/2;
            int minForLowerPart = n-minForUpperPart;
            if(countSecondZigZag >= minForLowerPart && countFirstZigZag >= minForUpperPart){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
