package binarysearch;

import java.util.Scanner;

public class MagicPowder1 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int noOfIngredients = obj.nextInt();
        int magicPowder = obj.nextInt();

        int[] ingredients = new int[noOfIngredients];

        for (int i = 0; i < noOfIngredients; i++) {
            ingredients[i] = obj.nextInt();
        }

        int[] ingredientAmounts = new int[noOfIngredients];

        for (int i = 0; i < noOfIngredients; i++) {
            ingredientAmounts[i] = obj.nextInt();
        }

        long minCookies = 0L;
        long maxCookies = (long) 1e13;


        while (minCookies <= maxCookies) {
            long mid = minCookies + (maxCookies - minCookies) / 2;
            long extraNeeded = 0;

            for (int i = 0; i < noOfIngredients; i++) {
                long requiredIthIngredientToMidNoOfCookies = mid * ingredients[i];
                extraNeeded += Math.max(0, requiredIthIngredientToMidNoOfCookies - ingredientAmounts[i]);
            }

            if (extraNeeded <= magicPowder) {
                minCookies = mid + 1;
            } else {
                maxCookies = mid - 1;
            }
        }

        System.out.println(maxCookies);
    }

}
