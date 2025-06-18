package hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CoolPartition {
    public static void main(String[] args) {
        Set<Integer> required = new HashSet<>();
        Set<Integer> current = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        while(numberOfTestCases-->0){

            int n = sc.nextInt();
            int ans =0;
            for(int i=0;i<n;i++){
                current.add(sc.nextInt());

                if(current.containsAll(required)){
                    ans++;
                    required = new HashSet<>(current);
                    current.clear();
                }
            }
            System.out.println(ans);
            required.clear();
            current.clear();
        }
    }
}
