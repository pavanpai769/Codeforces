package string;

import java.util.Scanner;
import java.util.Stack;

public class YetnotherrokenKeoard {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();

        while (numberOfTestCases-- > 0) {
            char[] str = obj.next().toCharArray();
            Stack<Integer> lowerCaseIndices = new Stack<>();
            Stack<Integer> upperCaseIndices = new Stack<>();

            for (int i = 0; i < str.length; i++) {
                if (str[i] == 'b') {
                    str[i] = ' ';
                    if (!lowerCaseIndices.isEmpty()) {
                        str[lowerCaseIndices.pop()] = ' ';
                    }
                } else if (str[i] == 'B') {
                    str[i] = ' ';
                    if (!upperCaseIndices.isEmpty()) {
                        str[upperCaseIndices.pop()] = ' ';
                    }
                }else{
                    if(Character.isLowerCase(str[i])){
                        lowerCaseIndices.push(i);
                    }else{
                        upperCaseIndices.push(i);
                    }
                }
            }

            for (int i = 0; i < str.length; i++) {
                if (str[i] != ' ') {
                    System.out.print(str[i]);
                }
            }
            System.out.println();
        }

        obj.close();
    }
}
