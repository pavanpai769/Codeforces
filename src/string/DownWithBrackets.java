package string;

import java.util.Scanner;
import java.util.Stack;

public class DownWithBrackets {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        Stack<Character> stack = new Stack<>();
        outer:
        while(numberOfTestCases-- > 0) {
            String s = obj.next();
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                }else if( !stack.isEmpty()) {
                    stack.pop();
                    if(stack.isEmpty() && i != s.length() - 1) {
                        System.out.println("Yes");
                        continue outer;
                    }
                }
            }

            System.out.println("No");
            stack.clear();
        }
    }
}
