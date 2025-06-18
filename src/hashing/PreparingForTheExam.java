package hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class PreparingForTheExam {
    static Scanner obj = new Scanner(System.in);

    public static void main(String[] args) {
        int t= obj.nextInt();
        while (t-- > 0) {
            System.out.println(solve());
        }
    }

    private static String solve() {

        int n = obj.nextInt();
        int m = obj.nextInt();
        int k = obj.nextInt();
        obj.nextLine();
        String lists = obj.nextLine();
        String knows  = obj.nextLine();



        if(k <= n-2){
            return "0".repeat(m);
        }else if(k==n){
            return "1".repeat(m);
        }
        StringBuilder sb = new StringBuilder("0".repeat(m));
        Integer[] list = Arrays.stream(lists.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        Set<Integer> knownQuestions = Arrays.stream(knows.split(" ")).map(Integer::parseInt).collect(Collectors.toSet());

        for(int i = 0; i < list.length; i++){
            if(!knownQuestions.contains(list[i])){
                sb.setCharAt(i,'1');
            }
        }
        return sb.toString();
    }
}
