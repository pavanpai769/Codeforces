package array;

import java.util.Scanner;

public class NenesGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {

            int numberOfPlayersSelected = sc.nextInt();
            int numberOfRounds = sc.nextInt();

            int firstPlayer = sc.nextInt();
            for(int i = 1; i < numberOfPlayersSelected; i++) {
                sc.nextInt();
            }

            for(int i=0;i<numberOfRounds;i++) {
                int numberOfPlayers = sc.nextInt();

                if(firstPlayer <= numberOfPlayers) {
                    System.out.print(firstPlayer-1+" ");
                }else{
                    System.out.print(numberOfPlayers+" ");
                }
            }
            System.out.println();
        }
    }
}
