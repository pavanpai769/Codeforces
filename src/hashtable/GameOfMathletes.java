package hashtable;

import java.util.HashMap;
import java.util.Scanner;

public class GameOfMathletes {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long numberOfTestCases = obj.nextLong();
        HashMap<Integer,Integer> map = new HashMap<>();
        while(numberOfTestCases-->0){
            int numberOfIntegers = obj.nextInt();
            int target = obj.nextInt();
            for(int i=0;i<numberOfIntegers;i++){
                int currentInteger = obj.nextInt();
                map.put(currentInteger,map.getOrDefault(currentInteger,0)+1);
            }
            int score = 0;
            for(int key :  map.keySet()){
                if(key == target-key){
                    score+= map.get(key)/2;
                }else {
                    score += Math.min(map.get(key), map.getOrDefault(target - key, 0));
                }
                map.put(key,0);
            }
            map.clear();
            System.out.println(score);

        }
    }
}
