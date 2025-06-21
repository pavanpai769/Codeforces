package greedy;

import java.util.Scanner;

public class BattleForSurvive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            long totalAbilityExceptLastTwo = 0;
            long[] persons = new long[n];
            for(int i=0;i<n;i++){
                persons[i] = sc.nextLong();
                if(i < n-2){
                    totalAbilityExceptLastTwo += persons[i];
                }
            }
            System.out.println(persons[n-1]-(persons[n-2]-totalAbilityExceptLastTwo));

        }
    }
}
