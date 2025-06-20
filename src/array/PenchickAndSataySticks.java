package array;

import java.util.Scanner;


public class PenchickAndSataySticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        outer:
        while(t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            boolean possible = true;

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if(arr[i] != i+1){
                    if(arr[i]==i+2 && arr[i+1] == i+1){
                        swap(arr,i,i+1);
                    }else{
                        possible = false;
                    }
                }
            }

            if(possible){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
