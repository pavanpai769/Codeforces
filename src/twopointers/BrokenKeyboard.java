package twopointers;

import java.util.Arrays;
import java.util.Scanner;


public class BrokenKeyboard {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            String screen = obj.next();
            Character[] keys = new Character[26];
            int i=0;
            int j =0;
            char currChar = screen.charAt(i);
            while(j<screen.length()){
                currChar = screen.charAt(i);
                while(j<screen.length() && screen.charAt(j)==currChar){
                    j++;
                }
                if((j-i)%2 !=0){
                    keys[currChar-'a']=currChar;
                }
                i=j;
            }
            if((j-i)%2 !=0){
                keys[currChar-'a']=currChar;
            }
            Arrays.stream(keys).forEach(character -> System.out.print(character!=null?character:""));
            System.out.println();
        }
    }
}
