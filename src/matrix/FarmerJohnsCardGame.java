package matrix;

import java.util.*;

public class FarmerJohnsCardGame {
    class Pair{
        int cow;
        int[] cards;

        public Pair(int cow,int[] cards){
            this.cow=cow;
            this.cards=cards;
        }
    }
    public static void main(String[] args) {
        FarmerJohnsCardGame game = new FarmerJohnsCardGame();
        game.solve();
    }

    private void solve(){
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        while(numberOfTestCases-->0){
            int numberOfCows = sc.nextInt();
            int numberOfCardsPerCow = sc.nextInt();

            List<Pair> cowWithCards = new ArrayList<>();

            for(int i=0;i<numberOfCows;i++){
                int[] ithCowsCards = new int[numberOfCardsPerCow];
                for(int j=0;j<numberOfCardsPerCow;j++){
                    ithCowsCards[j] = sc.nextInt();
                }
                Arrays.sort(ithCowsCards);
                cowWithCards.add(new Pair(i,ithCowsCards));
            }

            cowWithCards.sort(Comparator.comparingInt(a -> a.cards[0]));

            boolean possible = true;
            int cardInPile = -1;
            outer:
            for(int i=0;i<numberOfCardsPerCow;i++){
                for(int j=0;j<numberOfCows;j++){
                    int currentCard = cowWithCards.get(j).cards[i];
                    if(currentCard > cardInPile){
                        cardInPile = currentCard;
                    }else{
                        possible = false;
                        break outer;
                    }
                }
            }
            if(possible){
                for(int i=0; i< numberOfCows;i++){
                    System.out.print(cowWithCards.get(i).cow+1 +" ");
                }
            }else {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
