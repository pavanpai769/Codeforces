package array;

import java.util.*;

public class GorillaAndTheExam {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        outer:
        while(numberOfTestCases-- > 0){
            int n = obj.nextInt();
            int k = obj.nextInt();
            int[]  arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = obj.nextInt();
            }

            Arrays.sort(arr);
            List<Integer> freq = new ArrayList<>();
            freq.add(1);
            for(int i = 1; i < n ; i++){
                if(arr[i] == arr[i-1]){
                    freq.set(freq.size()-1, freq.getLast() + 1);
                }else{
                    freq.add(1);
                }
            }

            Collections.sort(freq);

            for(int i = 0; i < freq.size(); i++){
                if(freq.get(i) > k){
                    System.out.println(freq.size()-i);
                    continue outer;
                }
                k-=freq.get(i);
            }
            System.out.println(1);
        }

    }
}
