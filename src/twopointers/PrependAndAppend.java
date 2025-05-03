package twopointers;

import java.util.Scanner;

public class PrependAndAppend {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n =obj.nextInt();
            String str = obj.next();
            int i=0;
            int j=str.length()-1;

            while(i<j){
                if(str.charAt(i)== '0' && str.charAt(j)=='1'){
                    i++;
                    j--;
                }else if(str.charAt(i)=='1' && str.charAt(j)=='0'){
                    i++;
                    j--;
                }else{
                    break;
                }
            }
            System.out.println(j-i+1);
        }
    }
}
