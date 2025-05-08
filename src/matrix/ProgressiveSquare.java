package matrix;

import java.util.*;

public class ProgressiveSquare {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();
            int c = obj.nextInt();
            int d = obj.nextInt();

            int min = Integer.MAX_VALUE;

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n*n ; i++) {
                int currElement = obj.nextInt();
                map.put(currElement, map.getOrDefault(currElement, 0) + 1);
                min = Math.min(min, currElement);
            }

            int[][] matrix = new int[n][n];

            matrix[0][0] = min;
            boolean isProgressive = true;
            outer:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    
                    int curr = matrix[i][j];
                    
                    if( i+1 < n && matrix[i+1][j] == 0) {
                        int downElement = curr+d;
                        if (map.containsKey(downElement) && map.get(downElement) > 0) {
                            matrix[i + 1][j] = downElement;
                            map.put(downElement, map.get(downElement)-1);
                        }else{
                            isProgressive = false;
                            break outer;
                        }
                    }

                    if( j+1 < n && matrix[i][j+1] == 0) {
                        int rightElement = curr+c;
                        if (map.containsKey(rightElement) && map.get(rightElement) > 0) {
                            matrix[i][j+1] = rightElement;
                            map.put(rightElement, map.get(rightElement)-1);
                        }else{
                            isProgressive = false;
                            break outer;
                        }
                    }
                }
            }
            
            System.out.println(isProgressive ? "Yes" : "No");
            map.clear();

        }
    }
}
