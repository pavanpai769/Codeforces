package string;

import java.util.HashMap;
import java.util.Scanner;

public class NumericStringTemplate {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTests = obj.nextInt();
        HashMap<Character, Integer> charToInt = new HashMap<>();
        HashMap<Integer,Character> intToChar = new HashMap<>();
        while (numberOfTests-- > 0) {
            int n = obj.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
            }

            int m = obj.nextInt();
            while (m-- > 0) {
                String s = obj.next();
                if(s.length() != n){
                    System.out.println("NO");
                }else{
                    boolean equals = true;
                    for(int i=0;i<s.length();i++){
                        if(charToInt.containsKey(s.charAt(i)) && charToInt.get(s.charAt(i))!= arr[i]){
                            equals = false;
                            break;
                        }else if(!charToInt.containsKey(s.charAt(i))){
                            charToInt.put(s.charAt(i), arr[i]);
                        }

                        if(intToChar.containsKey(arr[i]) && intToChar.get(arr[i]) != s.charAt(i)){
                            equals = false;
                            break;
                        }else if(!intToChar.containsKey(arr[i])){
                            intToChar.put(arr[i], s.charAt(i));
                        }
                    }
                    if(equals){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                    intToChar.clear();
                    charToInt.clear();
                }
            }


        }
    }
}
