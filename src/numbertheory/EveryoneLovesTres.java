package numbertheory;

import java.util.Scanner;

public class EveryoneLovesTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n==1 || n== 3){
                System.out.println(-1);
            }else{
                if(n % 2 == 0){
                    System.out.println("3".repeat(n-2)+"66");
                }else{
                    System.out.println("3".repeat(n-5)+"36366");
                }
            }
        }
    }

}
