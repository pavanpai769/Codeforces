package matrix;

import java.util.Scanner;

public class AlicesAdventuresInChess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        outer:
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            String dir = sc.next();

            int x =0;
            int y =0;

            for(int i=0;i<100;i++){
                for(int j = 0;j< dir.length();j++){
                    if(dir.charAt(j)=='N'){
                        y++;
                    }else if(dir.charAt(j)=='S'){
                        y--;
                    }else if(dir.charAt(j)=='E'){
                        x++;
                    }else if(dir.charAt(j)=='W'){
                        x--;
                    }

                    if(x==a && y==b){
                        System.out.println("Yes");
                        continue outer;
                    }
                }
            }
            System.out.println("No");
        }
    }
}
