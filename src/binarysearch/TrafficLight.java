package binarysearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-->0){
            int sequenceLength = obj.nextInt();
            char currentLight = obj.next().charAt(0);

            String sequence = obj.next();
            if(currentLight == 'g'){
                System.out.println(0);
                continue;
            }

            int lastGForCurrLight = -1;
            int lastGINSequence = -1;

            List<Integer> currentLightIndices = new ArrayList<>();
            int[] indexToNextGreenLight = new int[sequenceLength];

            for(int i = sequenceLength-1 ; i >=0 ; i--){
                if(sequence.charAt(i) == currentLight){
                    currentLightIndices.add(i);
                }
                if(sequence.charAt(i) == 'g'){
                    if(lastGINSequence  == -1){
                        lastGINSequence = i;
                    }
                    lastGForCurrLight = i;
                }
                indexToNextGreenLight[i] = lastGForCurrLight;
            }
            for(int i=lastGINSequence+1; i< sequenceLength; i++ ){
                indexToNextGreenLight[i] = lastGForCurrLight;
            }
           System.out.println(getMinTimeToCrossRoad(sequenceLength,currentLightIndices,indexToNextGreenLight));

        }

    }

    private static int getMinTimeToCrossRoad(int sequenceLength, List<Integer> currentLightIndices,int[] indexToNextGreenLight) {
        int min = 0;
        int max = sequenceLength;

        while(min <= max){
            int mid = min + (max - min)/2;
            if(canCrossRoad(mid,currentLightIndices,indexToNextGreenLight,sequenceLength)){
                max = mid - 1;
            } else{
                min = mid + 1;
            }
        }
        return min;

    }

    private static boolean canCrossRoad(int time, List<Integer> currentLightIndices, int[] indexToNextGreenLight, int sequenceLength) {
        for (int currLightIndex : currentLightIndices) {
            int nextGreenIndex = indexToNextGreenLight[currLightIndex];
            int steps = (nextGreenIndex - currLightIndex + sequenceLength) % sequenceLength;

            if (steps > time) {
                return false;
            }
        }
        return true;
    }
}
