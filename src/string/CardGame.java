package string;

import java.util.Scanner;

public class CardGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(solve(s));
        }
    }

    private static String solve(String s){

        if(s.length() == 2){
            if(s.charAt(0) == 'A'){
                return "Alice";
            }
            return "Bob";
        }

        if(s.charAt(0) == s.charAt(s.length()-1)){
            if(s.charAt(0) == 'A'){
                return "Alice";
            }
            return "Bob";
        }

        boolean hasOnlyFirstCard = true;
        boolean hasOnlyLastCard = true;

        int maxCardHoldByAlice = 0;
        int maxCardHoldByBob = 0;

        for(int i = 1; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(1) ){
                hasOnlyFirstCard = false;
            }
            if(s.charAt(i) == s.charAt(s.length()-1) ){
                hasOnlyLastCard = false;
            }

            if(s.charAt(i) == 'A' && i+1 > maxCardHoldByAlice){
                maxCardHoldByAlice = i+1;
            }

            if(s.charAt(i) == 'B' && i+1 > maxCardHoldByBob){
                maxCardHoldByBob = i+1;
            }
        }

        if(hasOnlyFirstCard){
            if(s.charAt(0) == 'A'){
                return "Bob";
            }
            return "Alice";
        }

        if(hasOnlyLastCard){
            if(s.charAt(s.length()-1) == 'A'){
                return "Bob";
            }
            return "Alice";
        }

        if(s.charAt(s.length()-1) == 'A' && maxCardHoldByAlice > maxCardHoldByBob){
            return "Alice";
        }
        return "Bob";
    }


}
