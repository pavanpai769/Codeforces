package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }

            char withMaxFrequency = '$';
            char withMinFrequency = '#';
            for(char c : map.keySet()) {
                if(withMaxFrequency == '$' || map.get(c) > map.get(withMaxFrequency) ){
                    withMaxFrequency = c;
                }
                if(withMinFrequency == '#' || map.get(c) <= map.get(withMinFrequency) ){
                    withMinFrequency = c;
                }
            }



            System.out.println(s.replaceFirst(String.valueOf(withMinFrequency), String.valueOf(withMaxFrequency)));
        }
    }
}
