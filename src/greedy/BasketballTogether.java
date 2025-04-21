package greedy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BasketballTogether {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfPlayers = obj.nextInt();
        int opponentStrength = obj.nextInt();

        int[] teamMembers = new int[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            teamMembers[i] = obj.nextInt();
        }

        Arrays.sort(teamMembers);
        int j = numberOfPlayers-1;
        int i = 0;

        int countTeam =0;

        while(i<=j){
            int countMember = 1;
            int teamStrength = opponentStrength/teamMembers[j]+1;

            while(j>i && countMember != teamStrength ){
                i++;
                countMember++;
            }
            if(countMember == teamStrength){
                countTeam++;
            }
            j--;
        }

        System.out.println(countTeam);

    }
}
