package array;

import java.util.Arrays;
import java.util.Scanner;

public class BlockTowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        while (numberOfTestCases-- > 0) {
            int numberOfTowers = sc.nextInt();

            int[] numberOfBlocksInIthTower = new int[numberOfTowers-1];
            long numberOfBLocksInFirstTower = sc.nextInt();

            for (int i = 0; i < numberOfTowers-1 ; i++) {
                numberOfBlocksInIthTower[i] = sc.nextInt();
            }
            Arrays.sort(numberOfBlocksInIthTower);

            for (int i = 0; i < numberOfTowers-1; i++) {
                if(numberOfBlocksInIthTower[i] > numberOfBLocksInFirstTower) {
                    numberOfBLocksInFirstTower += getBlocks(numberOfBLocksInFirstTower,numberOfBlocksInIthTower[i]);
                }

            }
            System.out.println(numberOfBLocksInFirstTower);
        }
    }

    private static long getBlocks(long numberOfBlocksInIthTower, long numberOfBlocksInJthTower) {
        return (numberOfBlocksInJthTower-numberOfBlocksInIthTower+1)/2;
    }
}
