package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PoweringTheHero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while(numberOfTestCases-- > 0){
            int n = sc.nextInt();
            long bonus = 0;
            for(int i = 0; i < n; i++){
                int curr = sc.nextInt();
                if(curr != 0){
                    pq.add(curr);
                }else if(!pq.isEmpty()){
                    bonus += pq.poll();
                }
            }
            System.out.println(bonus);
            pq.clear();
        }
    }
}
