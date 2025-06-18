package greedy;

import java.util.Scanner;

public class ClockWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        while(numberOfTestCases-->0){
            int n = sc.nextInt();
            boolean possible = true;

            for(int i=0;i<n;i++){
                int time = sc.nextInt();

                if(time <= 2*i || time <= (n-1-i)*2) possible = false;
            }

            if(possible){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
