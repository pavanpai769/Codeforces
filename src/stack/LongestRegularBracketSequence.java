package stack;

import java.util.Scanner;
import java.util.Stack;

public class LongestRegularBracketSequence {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String sequence = obj.next();

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int maxLength = 0;
        int count = 0;

        for (int i = 0; i < sequence.length(); i++) {
            char c = sequence.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }

                if (!stack.isEmpty()) {
                    int length = i - stack.peek();
                    if (length > maxLength) {
                        maxLength = length;
                        count = 1;
                    } else if (length == maxLength) {
                        count++;
                    }
                } else {
                    stack.push(i);
                }
            }
        }
        System.out.println(maxLength != 0 ? maxLength+" "+count : "0 1");
    }
}
