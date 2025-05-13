package stack;

import java.util.Scanner;
import java.util.Stack;

public class ThreeIndices {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases  = obj.nextInt();
        Stack<int[]> monotonic = new Stack<>();
        while(numberOfTestCases-- > 0){
            int n = obj.nextInt();

            boolean isFound = false;

            for(int i=1; i<=n;i++){
                int currEle = obj.nextInt();

                if(isFound) continue;

               else if( !monotonic.isEmpty() && monotonic.peek()[0] > currEle){
                    if(monotonic.size() >= 2){
                        isFound = true;
                    }else{
                        monotonic.clear();
                    }
                }
                monotonic.push(new int[]{currEle,i});
            }

            if(isFound){
                System.out.println("Yes");
                int pk = monotonic.pop()[1];
                int pj = monotonic.pop()[1];
                int pi = monotonic.pop()[1];
                System.out.println(pi+" "+pj+" "+pk);
            }else{
                System.out.println("No");
            }
            monotonic.clear();
        }
    }
}