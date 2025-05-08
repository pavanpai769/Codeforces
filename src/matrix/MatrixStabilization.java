package matrix;

import java.util.Scanner;

public class MatrixStabilization {
    private static final int[] dir= {-1,0,1,0,-1};

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int row = obj.nextInt();
            int col = obj.nextInt();
            int[][] matrix = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = obj.nextInt();
                }
            }

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(stabilize(matrix,i,j)+" ");
                }
                System.out.println();
            }
        }
    }

    private static int stabilize(int[][] matrix, int currRow, int currCol) {
        int row = matrix.length;
        int col = matrix[0].length;

        int maxOfNeighbours = Integer.MIN_VALUE;
        for(int i=0; i< dir.length-1; i++){
            int newRow = currRow + dir[i];
            int newCol = currCol + dir[i+1];
            if(newRow >=0 && newRow < row && newCol >=0 && newCol < col){
                if(matrix[newRow][newCol] >= matrix[currRow][currCol]){
                    return matrix[currRow][currCol];
                }
                maxOfNeighbours = Math.max(maxOfNeighbours, matrix[newRow][newCol]);
            }
        }
        return maxOfNeighbours;
    }
}
