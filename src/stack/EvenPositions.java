package stack;

import java.util.Scanner;
import java.util.Stack;


public class EvenPositions {
    static class Pair{
        char bracket;
        int position;

        public Pair(char bracket, int position){
            this.bracket = bracket;
            this.position = position;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        Stack<Pair> stack = new Stack<>();
        while (numberOfTestCases-- > 0) {
            int length = sc.nextInt();
            String sequence = sc.next();
            long cost = 0;
            for(int i = 0; i < length; i++){
                if(stack.isEmpty() || sequence.charAt(i) == '('){
                    stack.push(new Pair('(', i));
                }else {
                    cost += i-stack.pop().position;
                }
            }
            System.out.println(cost);
            stack.clear();
        }
    }
}
