package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BasketballTogether {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfPlayers = input.nextInt();
        int opponentStrength = input.nextInt();

        int[] teamMembers = new int[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            teamMembers[i] = input.nextInt();
        }

        Arrays.sort(teamMembers);

        int min = 0;
        int max = numberOfPlayers;

        while(min <= max){
            int mid = min + (max-min)/2;

            if(canCreateTeamWithMidNumberOfMembers(mid,teamMembers,opponentStrength)){
                min = mid+1;
            }else{
                max = mid-1;
            }
        }
        System.out.println(max);

    }

    private static boolean canCreateTeamWithMidNumberOfMembers(int mid, int[] teamMembers,int opponentStrength){
        int[] teamStrength = new int[mid];

        for(int i=0; i<mid;i++){
            teamStrength[i] = teamMembers[teamMembers.length-1-i];
        }

        int j = 0;
        int i=0;
        while(j<mid){
            int maxStrength = teamStrength[j];
            while(i< teamMembers.length-mid && teamStrength[j]<=opponentStrength){
                teamStrength[j] += maxStrength;
                i++;
            }
            if(i>=teamMembers.length-mid && teamStrength[j]<=opponentStrength){
                break;
            }
            j++;
        }
        if(j >= mid){
            return true;
        }
        return false;
    }
}
