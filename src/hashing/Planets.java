package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Planets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        while (numberOfTestCases-- > 0) {
            int numberOfPlanets = sc.nextInt();
            int costToDestroyMultiplePlanets = sc.nextInt();
            for(int i = 0; i < numberOfPlanets; i++) {
                int currentPlanet = sc.nextInt();
                map.put(currentPlanet, map.getOrDefault(currentPlanet, 0) + 1);
            }

            int ans = 0;
            for(int planet : map.keySet()) {
                if(map.get(planet) == 1){
                    ans++;
                }else{
                    int costToDestroyIndividual = map.get(planet);
                    ans += Math.min(costToDestroyIndividual, costToDestroyMultiplePlanets);
                }
            }
            System.out.println(ans);
            map.clear();
        }
    }
}
