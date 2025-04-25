package array;

import java.util.ArrayList;
import java.util.Scanner;

public class SushiForTwo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfSushi = obj.nextInt();

        int[] sushiType = new int[numberOfSushi];
        ArrayList<Integer> maxSushi = new ArrayList();
        int count=1;
        for (int i = 0; i < numberOfSushi; i++) {
            sushiType[i] = obj.nextInt();
            if(i==0){
            } else if(sushiType[i]== sushiType[i-1]){
                count++;
            } else{
                maxSushi.add(count);
                count=1;
            }
        }
        maxSushi.add(count);
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<maxSushi.size()-1;i++){
            ans = Math.max(ans,Math.min(maxSushi.get(i),maxSushi.get(i+1)));
        }
        System.out.println(ans*2);
    }
}
