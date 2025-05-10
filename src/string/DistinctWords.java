package string;

import java.util.HashMap;
import java.util.Scanner;

public class DistinctWords {
    private static final int pointForWordWrittenByTwo = 1;
    private static final int pointForWordWrittenByOne = 3;

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int numberOfTestCases = obj.nextInt();
        HashMap<String,Integer> freqMap = new HashMap<String,Integer>();
        while (numberOfTestCases-- > 0) {
            int numberOfWords = obj.nextInt();
            String[][] words = new String[3][numberOfWords];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < numberOfWords; j++) {
                    words[i][j] = obj.next();
                    freqMap.put(words[i][j], freqMap.getOrDefault(words[i][j], 0) + 1);
                }
            }

            for(int i = 0; i < 3; i++){
                int countPoints = 0;
                for(int j = 0; j < numberOfWords; j++){
                    if(freqMap.get(words[i][j]) == 1){
                        countPoints += pointForWordWrittenByOne;
                    }else if(freqMap.get(words[i][j]) == 2){
                        countPoints += pointForWordWrittenByTwo;
                    }
                }
                System.out.print(countPoints+" ");
            }
            System.out.println();
            freqMap.clear();
        }

    }
}
