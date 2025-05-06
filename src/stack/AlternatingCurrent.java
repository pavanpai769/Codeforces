package stack;

import java.util.Scanner;
import java.util.Stack;


public class AlternatingCurrent {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String wire = obj.next();

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < wire.length(); i++) {
            if(!stack.isEmpty() && stack.peek() == wire.charAt(i)) {
                stack.pop();
            }else {
                stack.push(wire.charAt(i));
            }
        }
        System.out.println(stack.isEmpty()?"Yes":"No");
    }
}
