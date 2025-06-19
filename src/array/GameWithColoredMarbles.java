package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameWithColoredMarbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        Map<Integer,Integer> marbleFrequency= new HashMap<>();
        Map<Integer,Integer> colorFrequency= new HashMap<>();
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int marble = sc.nextInt();
                marbleFrequency.put(marble,marbleFrequency.getOrDefault(marble,0)+1);
            }
            for(int marble:marbleFrequency.keySet()){
                int currentMarbleFrequency = marbleFrequency.get(marble);
                colorFrequency.put(currentMarbleFrequency,colorFrequency.getOrDefault(currentMarbleFrequency,0)+1);
            }

            int aliceScore = 0;
            if(colorFrequency.containsKey(1)){
                int frequency = colorFrequency.get(1);
                aliceScore += ((frequency+1)/2)*2;
                colorFrequency.remove(1);
            }
            for(int color : colorFrequency.keySet()){
                aliceScore+= colorFrequency.get(color);
            }
            System.out.println(aliceScore);
            marbleFrequency.clear();
            colorFrequency.clear();
        }
    }
}
