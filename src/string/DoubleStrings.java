package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DoubleStrings {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            String[] strings = new String[n];
            Set<String> set = new HashSet<>();
            for(int i = 0; i < n; i++) {
                strings[i] = obj.next();
                set.add(strings[i]);
            }

            for(int i = 0; i < n; i++) {
                String str = strings[i];
                boolean found = false;
                for(int j = 1; j < strings[i].length(); j++) {
                    if(set.contains(str.substring(0,j)) && set.contains(str.substring(j)) ) {
                        found = true;
                        break;
                    }
                }
                System.out.print(found ? "1" : "0");
            }
            System.out.println();
        }
    }
}
