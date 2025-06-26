package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class VarietyIsDiscouraged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }

            int maxSubarrayLengthWithUniqueElements = 0;
            int lastIndexOfMaxSubarray = 0;

            int currentLengthWithUniqueElements = 0;

            for(int i=0; i<n; i++){
                if(map.get(arr[i]) == 1){
                    currentLengthWithUniqueElements++;
                    if(currentLengthWithUniqueElements > maxSubarrayLengthWithUniqueElements){
                        maxSubarrayLengthWithUniqueElements = currentLengthWithUniqueElements;
                        lastIndexOfMaxSubarray = i;
                    }
                }else {
                    currentLengthWithUniqueElements = 0;
                }
            }

            if(maxSubarrayLengthWithUniqueElements == 0){
                System.out.println(0);
            }else{
                int startIndex = lastIndexOfMaxSubarray-maxSubarrayLengthWithUniqueElements+1;
                System.out.println((startIndex+1)+" "+(lastIndexOfMaxSubarray+1));
            }
        }
    }
}
