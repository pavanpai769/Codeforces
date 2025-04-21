package binarysearch;

import java.util.Scanner;

public class Legs {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-->0){
            int legs = obj.nextInt();
            int min =0;
            int max = legs;
            while(min <= max){
                int mid = min+(max-min)/2;

                int maxLegs = mid*4;
                int minLegs = mid*2;

                if(legs >= minLegs && legs <= maxLegs){
                    max = mid-1;
                } else{
                    min = mid+1;
                }
            }
            System.out.println(min);
        }
    }
}
