package array;

import java.util.Scanner;

public class RestoringTheDurationOfTasks {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int numberOfTasks = obj.nextInt();
            int[] startTime = new int[numberOfTasks];
            int[] endTime = new int[numberOfTasks];

            for (int i = 0; i < numberOfTasks; i++) {
                startTime[i] = obj.nextInt();
            }
            for (int i = 0; i < numberOfTasks; i++) {
                endTime[i] = obj.nextInt();
            }

            int currTime = 0;
            for (int i = 0; i < numberOfTasks; i++) {
                currTime = Math.max(startTime[i],currTime);
                System.out.print(endTime[i] - currTime+" ");
                currTime = endTime[i];
            }
            System.out.println();
        }
    }
}
