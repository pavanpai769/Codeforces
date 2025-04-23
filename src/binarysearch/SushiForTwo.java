package binarysearch;

import java.util.Scanner;

// based on binary search. but got tle

public class SushiForTwo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfSushi  = obj.nextInt();

        int [] sushiType = new int[numberOfSushi];
        for (int i = 0; i < numberOfSushi; i++) {
            sushiType[i] = obj.nextInt();
        }

        int min =0;
        int max = numberOfSushi;
        int ans =0;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if(mid %2 ==1){
                if(canHeHave(mid-1,sushiType)){
                    ans = mid-1;
                    min = mid+1;
                } else{
                    max = mid-1;
                }
                continue;
            }
            if(canHeHave(mid,sushiType)){
                ans = mid;
                min = mid + 1;
            } else{
                max = mid - 1;
            }
        }
        System.out.println(ans);
    }

    private static boolean canHeHave(int mid, int[] sushiType) {
        for(int i=0;i<= sushiType.length-mid;i++){
            if(hasEqualPartition(i,mid+i,sushiType)) return true;
        }
        return false;
    }

    private static boolean hasEqualPartition(int part1, int part2,int[] sushiType) {
        int mid = (part1+(part2-1))/2;
        int firstPartType =0;
        for(int i=part1;i<=mid;i++){

            if(i== part1){
                firstPartType = sushiType[i];
                continue;
            }
            if(sushiType[i-1]!=sushiType[i]) return false;

        }
        for(int i=mid+1;i<part2;i++){
            if(sushiType[i]== firstPartType) return false;
            if(i== mid+1)continue;
            if(sushiType[i-1]!=sushiType[i]) return false;
        }
        return true;
    }


}
