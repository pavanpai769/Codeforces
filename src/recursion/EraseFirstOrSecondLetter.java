package recursion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EraseFirstOrSecondLetter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            obj.nextInt();
            Set<String> set = new HashSet<>();
        }
    }

    private static long eraseFirstOrSecondLetter(String s, Set<String> set) {

        if(set.contains(s)) return 0;
        set.add(s);
        if(s.length() == 1) return 1;

        String eraseFistChar = s.substring( 1);
        String eraseSecondChar = s.charAt(0)+s.substring(2);

        long totalUnique = eraseFirstOrSecondLetter(eraseFistChar, set)+eraseFirstOrSecondLetter(eraseSecondChar, set);

        return totalUnique+1;

    }
}
