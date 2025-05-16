package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EraseFirstOrSecondLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        while (numberOfTestCases-- > 0) {
            sc.nextInt();
            String str = sc.next();

            long ans = 0;
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i));
                ans+= set.size();
            }
            System.out.println(ans);
        }
    }


}
