package twopointers;

import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        int i=0;
        int j= n-1;

        int serejaSScore = 0;
        int dimaSScore = 0;
        boolean serejaSTurn = true;
        while(i<=j){
            if(serejaSTurn){
                if(arr[i]>arr[j]){
                    serejaSScore+=arr[i];
                    i++;
                }else{
                    serejaSScore+=arr[j];
                    j--;
                }
                serejaSTurn = false;
            }else{
                if(arr[i]>arr[j]){
                    dimaSScore+=arr[i];
                    i++;
                }else{
                    dimaSScore+=arr[j];
                    j--;
                }
                serejaSTurn = true;
            }
        }
        System.out.println(serejaSScore+" "+dimaSScore);
    }
}
