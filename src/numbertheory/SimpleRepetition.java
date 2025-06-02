package numbertheory;

import java.util.Scanner;

public class SimpleRepetition {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-- > 0) {
            int x= obj.nextInt();
            int k = obj.nextInt();

            if( x > 1 && k > 1){
                System.out.println("No");
            }else if(k==1){
                    System.out.println(isPrime(x)?"Yes":"No");
            }else{
                System.out.println((k==2)?"Yes":"No");
            }
        }
    }

    private static boolean isPrime(int number) {
        if(number <= 1){
            return false;
        }
        for(int i=2; i<= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
