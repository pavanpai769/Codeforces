package array;

import java.util.*;

public class Hotelier {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int[] hotel = new int[10];
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < 10; i++) {
            set.add(i);
        }

        int n = obj.nextInt();
        String sequence = obj.next();

        for (int i = 0; i < sequence.length(); i++) {
            if(sequence.charAt(i) == 'L') {
               hotel[set.pollFirst()] = 1;
            }else if(sequence.charAt(i) == 'R') {

                hotel[set.pollLast()]=1;
            }else{
                int idx = Integer.parseInt(sequence.substring(i,i+1));
                hotel[idx]=0;
                set.add(idx);
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.print(hotel[i]);
        }
        System.out.println();

    }
}
