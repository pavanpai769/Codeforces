package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AboveTheClouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String middle = s.substring(1,n-1);
            String strat = s.substring(0,1);
            String end = s.substring(n-1,n);

            if(middle.contains(strat) || middle.contains(end)){
                System.out.println("Yes");
            }else{
                Map<Character,Integer> map = new HashMap<>();
                for(char c : middle.toCharArray()){
                    map.put(c,map.getOrDefault(c,0)+1);
                }
                boolean valid = false;
                for(char c : map.keySet()){
                    if(map.get(c)>1){
                        valid = true;
                        break;
                    }
                }

                if(valid){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
