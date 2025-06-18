package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Crafting {
    static class Pair{
        int a;
        int b;

        @Override
        public String toString() {
            return "<"+this.a+","+this.b+">";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Pair[] units = new Pair[n];
            for(int i=0;i<n;i++){
                units[i] = new Pair();
                units[i].a=sc.nextInt();

            }

            int countShortageElements = 0;
            int operationsNeededToBalance = 0;
            int maxOperationsAllowed = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                units[i].b=sc.nextInt();

                if(units[i].a < units[i].b){
                    countShortageElements++;
                    operationsNeededToBalance = units[i].b-units[i].a;
                    continue;

                }
                maxOperationsAllowed = Math.min(maxOperationsAllowed, units[i].a-units[i].b);
            }
            if(countShortageElements >= 2){
                System.out.println("No");
            }else if(countShortageElements == 0 || operationsNeededToBalance <= maxOperationsAllowed){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
