package array;

import java.util.Scanner;

public class FlowerCityFence {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int numberOfPlanks = obj.nextInt();
            int[] planks = new int[numberOfPlanks];
            for (int i = 0; i < numberOfPlanks; i++) {
                planks[i] = obj.nextInt();
            }

            System.out.println(isSymmetric(planks)?"Yes":"No");
        }
    }

    private static boolean isSymmetric(int[] planks) {

        int currentLevel = 1;
        int i=0;
        int j = planks.length - 1;
        while (j>=0) {
            if (j+1 != planks[i]) return false;

            while(j>= 0 && planks[j] == currentLevel) {
                j--;
            }
            currentLevel++;
            i++;

        }
        return true;
    }
}
