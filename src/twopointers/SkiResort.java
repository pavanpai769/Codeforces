package twopointers;

import java.util.Scanner;

public class SkiResort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();

        while(numberOfTestCases-- > 0) {
            int numberOfDays = obj.nextInt();
            int consecutiveDays = obj.nextInt();
            int maxTemperature = obj.nextInt();

            int[] temperatureOfTheDay = new int[numberOfDays];
            for(int i=0;i<numberOfDays;i++) {
                temperatureOfTheDay[i] = obj.nextInt();
            }

            int i=0;
            int j=0;
            long totalCombinations = 0;
            while(i<numberOfDays) {
                if(temperatureOfTheDay[i] > maxTemperature) {
                    i++;
                    continue;
                }
                j=i;
                while(j< numberOfDays && temperatureOfTheDay[j] <= maxTemperature) {
                    j++;
                }

                int maximumDays = j-i;
                if(maximumDays<consecutiveDays) {
                    i=j;
                    continue;
                }
                int extraDays = maximumDays-consecutiveDays;
                int valid = extraDays+1;
                /*
                   Consider you have 5 days and k = 2:
                   [{d1, d2}, d3, d4, d5]

                   Since the minimum required days is 2, {d1, d2} forms the first valid subarray.

                   Now you can make combinations using the remaining 3 elements:
                   (d2, d3), (d3, d4), and (d4, d5)

                   So the number of valid subarrays is 3 + 1 = 4.
                */


                totalCombinations += (long) (valid) *(valid+1)/2;
                i=j;
            }
            System.out.println(totalCombinations);
        }
    }
}
