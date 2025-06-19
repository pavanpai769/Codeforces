package string;

import java.util.Scanner;

public class ShohagLovesStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        outer:
        while(t-->0){
            String s = sc.next();
            for(int i=0 ;i< s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    System.out.println(s.substring(i,i+2));
                    continue outer;
                }
            }

            for(int i=0 ;i< s.length()-2;i++){
                if(s.charAt(i)!=s.charAt(i+1) &&  s.charAt(i)!=s.charAt(i+2) &&  s.charAt(i+1)!=s.charAt(i+2)){
                    System.out.println(s.substring(i,i+3));
                    continue outer;
                }
            }
            System.out.println(-1);
        }
    }
}
