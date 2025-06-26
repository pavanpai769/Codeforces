package string;

import java.util.Scanner;
import java.util.function.BiFunction;

public class RobotProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0){
            int n = sc.nextInt();
            int currentPos = sc.nextInt();
            long time = sc.nextLong();

            String instructions  = sc.next();

            System.out.println(solve(n,currentPos,time, instructions));
        }
    }

    private static long solve(int n, int position, long time,  String instructions) {

        int currentPos = position;

        BiFunction<Character,Integer,Integer> move = (ch, pos) -> ch=='L' ? pos-1 : pos+1;

        for(int i= 0; i<n;i++){
            time--;
            char in = instructions.charAt(i);
            currentPos = move.apply(in,currentPos);
            if(currentPos == 0) break;
        }

        if(currentPos != 0){
            return 0;
        }

        long ans = 1;

        for(int i=0; i<n;i++){
            currentPos = move.apply(instructions.charAt(i),currentPos);
            if(currentPos == 0){
                ans += (time/(i+1));
                break;
            }
        }

        return ans;
    }
}
