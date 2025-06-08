package string;

import java.util.Arrays;
import java.util.Scanner;

public class ServalAndStringTheory {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int k = obj.nextInt();

            String s = obj.next();
            String rev = new StringBuilder(s).reverse().toString();

            if(s.compareTo(rev) < 0){
                System.out.println("Yes");
            }
            else if(k>=1){
                char[] arr = s.toCharArray();
                Arrays.sort(arr);
                System.out.println(arr[0]==arr[n-1]?"No":"Yes");

            }else{
                System.out.println("No");
            }





        }
    }
}
