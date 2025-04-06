package binarysearch;

import java.util.Scanner;

public class Hamburgers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String recipe = obj.next();
        int nb = obj.nextInt();
        int ns = obj.nextInt();
        int nc = obj.nextInt();

        int pb  = obj.nextInt();
        int ps = obj.nextInt();
        int pc  = obj.nextInt();

        long r = obj.nextLong();

        long min =0L;
        long max = (long)1e13;


        int countBread =(int) recipe.chars().filter(element-> element=='B').count();
        int countSausage =(int) recipe.chars().filter(element-> element=='S').count();
        int countCheese =(int) recipe.chars().filter(element-> element=='C').count();

        while(min<=max){
            long mid = (min+max)/2;

            long breadForMid = Math.max(0,mid*countBread-nb);
            long sausageForMid = Math.max(0,mid*countSausage-ns);
            long cheeseForMid = Math.max(0,mid*countCheese-nc);

            long totalCost = breadForMid*pb + sausageForMid*ps + cheeseForMid*pc;

            if(totalCost <= r){
                min = mid+1;
            }else{
                max = mid-1;
            }
        }
        System.out.println(max);
    }
}
