package string;

import java.util.Scanner;

public class BinaryTypeWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            char curr ='0';
            int pairs = 0;
            for(int i=0;i<n;i++) {
                if(s.charAt(i) != curr) {
                    pairs++;
                    curr = s.charAt(i);
                }
            }

            if(pairs >= 3){
                System.out.println(pairs-2+n);
            }else if(pairs == 2){
                System.out.println(pairs-1+n);
            }else{
                System.out.println(pairs+n);
            }
        }
    }
}
