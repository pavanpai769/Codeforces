package twopointers;

import java.util.Scanner;

public class ShoeShuffling {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int numberOfShoes = obj.nextInt();
            int[] shoes = new int[numberOfShoes];

            int currShoeCount =1;
            boolean hasOnlyOneShoe = false;
            for (int i = 0; i < numberOfShoes; i++) {
                shoes[i] = obj.nextInt();
                if(i==0){
                    continue;
                }

                if(shoes[i]== shoes[i-1] ) {
                    currShoeCount++;
                }else{
                    if(currShoeCount==1){
                        hasOnlyOneShoe = true;
                    }else{
                        currShoeCount=1;
                    }
                }

            }
            if(currShoeCount==1){
                hasOnlyOneShoe = true;
            }
            if(hasOnlyOneShoe){
                System.out.println(-1);
            }else {
                int i=0;
                int j=0;
                while(i<shoes.length){
                    j=i;
                    while(j<shoes.length && shoes[i]==shoes[j]){
                        j++;
                    }
                    printShoes(shoes,i,j-1);
                    i=j;
                }
                for(i=0;i<shoes.length;i++){
                    System.out.print(shoes[i]+" ");
                }
                System.out.println();
            }
        }
    }

    private static void printShoes(int[] shoes,int i, int j) {
        int currWindowSize = j-i+1;
        while(currWindowSize!=2 && currWindowSize!=3){
            shoes[i] = j+1;
            shoes[j] = i+1;
            i++;
            j--;

            currWindowSize-=2;
        }
        if(currWindowSize==3){
            shoes[i] = i+2;
            shoes[i+1] = j+1;
            shoes[j] = i+1;
        }else{
            shoes[i] = j+1;
            shoes[j] = i+1;
        }
    }
}
