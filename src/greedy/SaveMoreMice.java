package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class SaveMoreMice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        while (numberOfTestCases-- > 0) {
            int positionOfHole = sc.nextInt();
            int numberOfMice = sc.nextInt();
            int[] micePositions = new int[numberOfMice];
            for (int i = 0; i < numberOfMice; i++) {
                micePositions[i] = sc.nextInt();
            }
            int catPosition =0;
            int ans = 0;
            Arrays.sort(micePositions);
            for(int i= numberOfMice-1;i>=0;i--){
                if(catPosition >= micePositions[i]) break;
                int timeRequiredToMiceToMoveHole = positionOfHole-micePositions[i];
                catPosition+=timeRequiredToMiceToMoveHole;
                ans++;
            }
            System.out.println(ans);
        }

    }
}
