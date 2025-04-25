package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfDormitories = obj.nextInt();
        int numberOfLetters = obj.nextInt();

        long[] roomNumbers = new long[numberOfDormitories+1];
        roomNumbers[0] = 0L;
        for(int i = 1; i <= numberOfDormitories; i++) {
            roomNumbers[i] = obj.nextLong()+roomNumbers[i-1];
        }

        for(int i=0 ; i<numberOfLetters;i++){
            long letterNumber = obj.nextLong();
            getDormitoryWithRoomNumber(roomNumbers,letterNumber);
        }
    }

    private static void getDormitoryWithRoomNumber(long[] roomNumbers, long letterNumber) {
        int min = 1;
        int max = roomNumbers.length-1;

        while(min<=max){
            int mid = (min+max)/2;
            if(roomNumbers[mid]>=letterNumber){
                max = mid-1;
            } else{
                min = mid+1;
            }
        }

        long numberOfRoomsInCorrespondingDormitory = roomNumbers[min]-roomNumbers[min-1];
        long roomNumber = numberOfRoomsInCorrespondingDormitory-(roomNumbers[min]-letterNumber);
        System.out.println(min+" "+roomNumber);
    }
}
