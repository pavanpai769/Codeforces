package matrix;

import java.util.*;

public class BrrBrrPatapim {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();

            int[][] grid = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = obj.nextInt();
                    if (j == 0) {
                        map.put(grid[i][j], i);
                    }
                }
            }
            Set<Integer> set = new LinkedHashSet<>();

            int start = grid[0][0];
            int currRow =0;
            set.add(start);
            while (map.containsKey(start)&& n!=1) {
                currRow = map.get(start);
                start = grid[currRow][1];
                set.add(start);
            }

            for(int i=2; i<n;i++){
                set.add(grid[currRow][i]);
            }

            int i=1;
            while(set.contains(i)){
                i++;
            }
            System.out.print(i+" ");
            for(int ele: set){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
