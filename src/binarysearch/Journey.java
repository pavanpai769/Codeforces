package binarysearch;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();

        while (numberOfTestCases-- > 0) {
            int totalDistanceToEndJourney = obj.nextInt();

            int[] dailyDistances = new int[3];
            dailyDistances[0] = obj.nextInt();
            dailyDistances[1] = obj.nextInt();
            dailyDistances[2] = obj.nextInt();

            System.out.println(countMinDaysToReachTarget(totalDistanceToEndJourney, dailyDistances));
        }
    }

    private static long countMinDaysToReachTarget(int totalDistanceToEndJourney, int[] journey) {
        long min = 0;
        long max = (long) 1e13;

        long totalJourneyIn3Days = journey[0] + journey[1] + journey[2];

        while (min <= max) {

            long midDays = min + (max - min) / 2;

            long completedThreeDayCycles = midDays / 3;
            long travelledDistanceIn3DayCycles = completedThreeDayCycles * totalJourneyIn3Days;

            long restDays = midDays % 3;
            long travelledDistanceInRestDays = 0;

            for (int i = 0; i < restDays; i++) {
                travelledDistanceInRestDays += journey[i];
            }

            long totalDistanceCovered = travelledDistanceInRestDays + travelledDistanceIn3DayCycles;

            if (totalDistanceCovered == totalDistanceToEndJourney) {
                return midDays;
            }

            if (totalDistanceCovered > totalDistanceToEndJourney) {
                max = midDays - 1;
            } else {
                min = midDays + 1;
            }
        }
        return min;
    }

}
