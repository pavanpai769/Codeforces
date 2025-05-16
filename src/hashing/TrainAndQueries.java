package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainAndQueries {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        Map<Integer,int[]> stationIndices = new HashMap<>();
        while (numberOfTestCases-- > 0) {
            int numberOfStations = obj.nextInt();
            int numberOfQueries = obj.nextInt();

            for (int i = 0; i < numberOfStations; i++) {
                int station = obj.nextInt();
                if(stationIndices.containsKey(station)) {
                    stationIndices.get(station)[1] =  i;
                }else{
                    stationIndices.put(station,new int[]{i,i});
                }
            }

            for (int i = 0; i < numberOfQueries; i++) {
                int start = obj.nextInt();
                int end = obj.nextInt();

                System.out.println(canTravel(start,end,stationIndices));
            }
            stationIndices.clear();
        }

    }

    private static String canTravel(int start, int end, Map<Integer,int[]> stationIndices) {
        if( !stationIndices.containsKey(start) || !stationIndices.containsKey(end) ) {
            return "No";
        }

        return stationIndices.get(start)[0] <= stationIndices.get(end)[1] ? "Yes" : "No";
    }
}
