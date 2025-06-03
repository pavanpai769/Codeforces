package matrix;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PushingBalls {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while(numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int m = obj.nextInt();

            List<String> matrix = new LinkedList<>();

            for(int i=0;i<n;i++){
                matrix.add(obj.next());
            }

            System.out.println(isValid( matrix,n,m)?"YES":"NO");
        }
    }

    private static boolean isValid(List<String> matrix, int n, int m) {
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).charAt(j)=='0'){
                    break;
                }
                vis[i][j] = true;
            }
        }

        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(matrix.get(i).charAt(j)=='0'){
                    break;
                }
                vis[i][j] = true;
            }
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).charAt(j)=='1' && !vis[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
