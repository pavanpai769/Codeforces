package hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ICPCBallons {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        Set<Character> set = new HashSet<>();
        while (numberOfTestCases-- > 0) {
            obj.nextInt();
            String str = obj.next();

            int point = 0;
            for( char c : str.toCharArray() ) {
                if(set.contains(c)) {
                    point++;
                }else{
                    set.add(c);
                    point+=2;
                }
            }
            System.out.println(point);
            set.clear();
        }
    }
}
