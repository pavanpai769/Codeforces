package string;

import java.util.Scanner;

public class HavingBeenATreasurerInThePastIHelpGoblinsDeceive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        while (numberOfTestCases-- > 0) {
            sc.nextInt();
            String str = sc.next();
            int countUnderScore = 0;
            int countHyphen = 0;

            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '-') {
                    countHyphen++;
                }else
                    countUnderScore++;
            }

            int hyphenBeforeUnderScore = countHyphen/2;
            System.out.println((long)hyphenBeforeUnderScore*countUnderScore*(countHyphen-hyphenBeforeUnderScore));
        }
    }
}
