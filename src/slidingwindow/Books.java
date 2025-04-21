package slidingwindow;

import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfBooks = obj.nextInt();
        int time = obj.nextInt();
        int[] timeRequiredToReadBooks = new int[numberOfBooks];

        for (int i = 0; i < numberOfBooks; i++) {
            timeRequiredToReadBooks[i] = obj.nextInt();
        }

        int ans = 0;
        int left =0;

        int totalTime =0;
        for(int right =0;right<numberOfBooks;right++){

            totalTime += timeRequiredToReadBooks[right];

            while(totalTime > time){
                totalTime -= timeRequiredToReadBooks[left];
                left++;
            }

            ans = Math.max(ans,right-left+1);
        }
        System.out.println(ans);
    }
}
