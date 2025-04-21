package math;

import java.util.Scanner;

public class GamerHemose {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numberOfTestCases = obj.nextInt();
        while (numberOfTestCases-- > 0) {

            int numberOfWeapons = obj.nextInt();
            int enemyHealth  = obj.nextInt();

            int highestDamagingWeapon = 0;
            int secondHighestDamagingWeapon = 0;

            for(int i = 0; i < numberOfWeapons; i++) {
                int currWeaponDamage = obj.nextInt();
                if(currWeaponDamage >= highestDamagingWeapon){
                    secondHighestDamagingWeapon = highestDamagingWeapon;
                    highestDamagingWeapon = currWeaponDamage;
                }
                if(currWeaponDamage> secondHighestDamagingWeapon && currWeaponDamage< highestDamagingWeapon){
                    secondHighestDamagingWeapon = currWeaponDamage;
                }
            }
            System.out.println(getMinWeapons(highestDamagingWeapon,secondHighestDamagingWeapon,enemyHealth));
        }
    }

    private static int getMinWeapons(int highestDamagingWeapon, int secondHighestDamagingWeapon, int enemyHealth) {

        int totalDamage = highestDamagingWeapon+secondHighestDamagingWeapon;
        int minWeaponsCycle = enemyHealth/totalDamage;

        if(enemyHealth%totalDamage == 0){
            return minWeaponsCycle*2;
        }
        if(enemyHealth% totalDamage > highestDamagingWeapon){
            return minWeaponsCycle*2+2;
        }
        return minWeaponsCycle*2+1;
    }
}
