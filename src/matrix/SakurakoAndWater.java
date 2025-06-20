package matrix;

import java.util.Scanner;

public class SakurakoAndWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            int ans = 0;

            for(int i=0; i<n;i++){
                int k =i;
                int j =0;
                int min = 0;
                while(j<n && k<n){
                    if(matrix[k][j]<0){
                        min = Math.min(min,matrix[k][j]);
                    }
                    j++;
                    k++;
                }
                ans+= Math.abs(min);
            }

            for(int j = 1; j<n;j++){
                int k = j;
                int i=0;
                int min = 0;
                while(i<n && k<n){
                    if(matrix[i][k]<0){
                        min = Math.min(min,matrix[i][k]);
                    }
                    i++;
                    k++;
                }
                ans += Math.abs(min);
            }

            System.out.println(ans);
        }
    }
}
