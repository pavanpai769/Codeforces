package hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RecentActions {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases =obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int numberOfPosts = obj.nextInt();
            int numberOfActions = obj.nextInt();

            Set<Integer> posts = new HashSet<>();
            for (int i = 1; i <= numberOfPosts; i++) {
                posts.add(i);
            }

            int[] ans = new int[numberOfPosts];

            int lastPost = ans.length - 1;
            for(int i=1; i<=numberOfActions;i++){
                int currentPost = obj.nextInt();
                if(lastPost < 0){
                    continue;
                }
                if(!posts.contains(currentPost)) {
                    posts.remove(lastPost+1);
                    posts.add(currentPost);
                    ans[lastPost--] = i;
                }
            }

            for(int ele : ans){
                System.out.print((ele != 0 ? ele : -1 )+" ");
            }
            System.out.println();
        }
    }
}
