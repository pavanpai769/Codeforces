package binarysearch;

import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfBooks = obj.nextInt();
        int time = obj.nextInt();

        int[] timeRequiredToReedBooks = new int[numberOfBooks];
        for (int i = 0; i < numberOfBooks; i++) {
            timeRequiredToReedBooks[i] = obj.nextInt();
        }

        int low = 0;
        int high = numberOfBooks;

        while(low<=high){
            int k = low+(high-low)/2;
            if(canReadKNumberOfBooksInTTime(k,timeRequiredToReedBooks,time)){
                low= k+1;
            }else{
                high = k-1;
            }

        }
        System.out.println(high);
    }

    private static boolean canReadKNumberOfBooksInTTime(int k, int[] timeRequiredToReedBooks,int time){
        long sum = 0;
        for(int i=0;i<k;i++){
            sum+=timeRequiredToReedBooks[i];
        }

        if(sum <= time) return true;

        for(int i=k;i<timeRequiredToReedBooks.length;i++){
            sum+= timeRequiredToReedBooks[i];
            sum-=timeRequiredToReedBooks[i-k];

            if(sum <= time) return true;
        }
        return false;
    }
}
