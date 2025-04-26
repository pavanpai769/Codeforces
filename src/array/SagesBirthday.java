package array;

import java.util.Arrays;
import java.util.Scanner;

public class SagesBirthday {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfIceSpheres = obj.nextInt();
        int[] priceOfIceSpheres = new int[numberOfIceSpheres];

        for (int i = 0; i < numberOfIceSpheres; i++) {
            priceOfIceSpheres[i] = obj.nextInt();
        }

        Arrays.sort(priceOfIceSpheres);
        int iMax = (priceOfIceSpheres.length)/2-1;

        int i=0;
        int j = iMax+1;
        System.out.println(priceOfIceSpheres.length%2==0 ? iMax : iMax+1);
        while(j<priceOfIceSpheres.length){
            System.out.print(priceOfIceSpheres[j]+" ");
            if(i <= iMax){
                System.out.print(priceOfIceSpheres[i]+" ");
            }
            i++;
            j++;
        }

    }
}
