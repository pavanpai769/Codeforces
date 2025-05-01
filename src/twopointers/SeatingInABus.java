package twopointers;

import java.util.Scanner;

public class SeatingInABus {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-->0){
            int n = obj.nextInt();
            int l=-1;
            int r=-1;
            boolean firstPersonSeated = false;
            boolean gotAnswer = false;
            for(int i=0;i<n;i++) {
                int seat = obj.nextInt();
                if(gotAnswer){
                    continue;
                }
                if (!firstPersonSeated) {
                    l = seat;
                    r = seat;
                    firstPersonSeated = true;
                } else {
                    if( seat+1 == l || seat-1 == r){
                        l = Math.min(l,seat);
                        r = Math.max(r,seat);
                    }
                    else {
                        System.out.println("No");
                        gotAnswer = true;
                    }
                }
            }
            if(!gotAnswer){
                System.out.println("Yes");
            }
        }
    }
}
