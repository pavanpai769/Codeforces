package bruteforce;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LLPS {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        List<String> subsequences = new ArrayList<>();
        generateSubSequences(subsequences,0,str,new StringBuilder());
        String maxStr = "";
        for(String subsequence : subsequences){
            if(isPalindrome(subsequence) && subsequence.compareTo(maxStr)>0){
                maxStr = subsequence;
            }
        }
        System.out.println(maxStr);
    }

    private static void generateSubSequences(List<String> subsequences, int idx, String src, StringBuilder curr) {
        if(idx >= src.length() ){
            subsequences.add(curr.toString());
            return;
        }
        curr.append(src.charAt(idx));
        generateSubSequences(subsequences,idx+1,src,curr);
        curr.deleteCharAt(curr.length()-1);
        generateSubSequences(subsequences,idx+1,src,curr);
    }

    private static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
