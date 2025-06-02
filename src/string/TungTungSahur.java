package string;


import java.util.Scanner;

public class TungTungSahur {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int numberOfTestCases = obj.nextInt();
        outer:
        while(numberOfTestCases-- > 0) {
            String sound = obj.next();
            String out = obj.next();

            if(out.length() < sound.length()) {
                System.out.println("No");
                continue;
            }
            int i=0;
            int j=0;


            while(i < sound.length() && j < out.length()) {
                int countSoundAlphabet = 0;
                int countOutAlphabet = 0;
                if(sound.charAt(i) != out.charAt(j)) {
                    System.out.println("No");
                    continue outer;
                }
                char currentSound = sound.charAt(i);
                while (i < sound.length() && sound.charAt(i) == currentSound) {
                    countSoundAlphabet++;
                    i++;
                }

                while(j< out.length() && out.charAt(j) == currentSound) {
                    countOutAlphabet++;
                    j++;
                }
                if( countOutAlphabet < countSoundAlphabet  || countOutAlphabet > (long)countSoundAlphabet*2) {
                    System.out.println("No");
                    continue outer;
                }
            }
            if (i < sound.length() || j< out.length()) {
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }

        }
    }
}
