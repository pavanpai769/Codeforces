package array;

import java.util.Scanner;

public class IndexAndMaximumValue {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-- > 0) {

            int n = obj.nextInt();
            int m = obj.nextInt();

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, obj.nextInt());
            }

            while (m-- > 0) {
                String operation = obj.next();
                int l = obj.nextInt();
                int r = obj.nextInt();

                if(operation.equals("+")) {
                    if(l<=max && max <= r){
                        max++;
                    }
                }else{
                    if(l<=max && max <= r){
                        max--;
                    }
                }
                System.out.print(max+" ");
            }
            System.out.println();

        }

    }
}
