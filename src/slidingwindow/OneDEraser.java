package slidingwindow;

import java.util.Scanner;

public class OneDEraser {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-->0){
            int n = obj.nextInt();
            int k = obj.nextInt();
            String paper = obj.next();
            int i=0;
            int ans =0;
            while(i< paper.length() ){
                if(paper.charAt(i)=='W'){
                    i++;
                }else{
                    ans++;
                    i+=k;
                }
            }
            System.out.println(ans);
        }
    }
}
