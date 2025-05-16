package array;

import java.util.Scanner;

public class BinaryInversion {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {
            int n = obj.nextInt();

            int[] binary = new int[n];
            int firstZeroIdx = -1;
            int lastOneIdx = -1;
            long inversionCount = 0;
            int countOne =0;
            int countZero = 0;

            for (int i = 0; i < n; i++) {
                binary[i] = obj.nextInt();
                if (binary[i] == 0 ) {
                    if(firstZeroIdx == -1)  firstZeroIdx = i;
                    inversionCount += countOne;
                    countZero++;
                }
                if (binary[i] == 1) {
                    lastOneIdx = i;
                    countOne++;
                }

            }

            int countOneBeforeFirstZero = 0;
            for (int i = 0; i < firstZeroIdx; i++) {
                if(binary[i] == 1) countOneBeforeFirstZero++;
            }

            int countZeroAfterLastOne = 0;
            for (int i = n-1 ; i> lastOneIdx; i--) {
                if(binary[i] == 0) countZeroAfterLastOne++;
            }

            long numberOfInversionsAfterFlippingOne = (inversionCount-countZeroAfterLastOne)+(countOne-1);

            long numberOfInversionsAfterFlippingZero = (inversionCount-countOneBeforeFirstZero)+(countZero-1);

            System.out.println(Math.max(numberOfInversionsAfterFlippingOne, Math.max(numberOfInversionsAfterFlippingZero,inversionCount)));


        }
    }
}
