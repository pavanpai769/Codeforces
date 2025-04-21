package slidingwindow;

import java.util.Scanner;

public class TwoScreen {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            String str1 = obj.next();
            String str2 = obj.next();
            System.out.println(countMinSecond(str1,str2));
        }
    }

    private static  int countMinSecond(String str1,String str2){
        int i=0;
        int countCommonPrefixLength =0;

        while(i <str1.length()&& i <str2.length()){
            if(str1.charAt(i)==str2.charAt(i)){
                countCommonPrefixLength++;
            }
            else break;
            i++;
        }

        int restCharsInStr1 =  str1.length()-i;
        int restCharsInStr2 =  str2.length()-i;

        int totalSecondToPrintCommonPrefixLength = countCommonPrefixLength == 0? 0:countCommonPrefixLength+1;
        return   totalSecondToPrintCommonPrefixLength+restCharsInStr1+restCharsInStr2 ;

    }
}
