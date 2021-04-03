package basic.ict.kosovo.growth;

public class LojaMeLetra {
    public static void main(String[] args) {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"♣", "♦", "♥", "♠"};
        String[] fullDeck = new String[ranks.length * suits.length]; //definimin e 52 letrave

        //per cdo suit ne suits shtype suit
        for(String suit: suits) {
            System.out.println(suit);
        }

        //    int num = 0;
        //per cdo suit
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                fullDeck[i * ranks.length + j] = ranks[j] + suits[i];
                // num++;
            }
        }
        for (int i = 0; i < fullDeck.length; i++) {
            System.out.printf("%5s", fullDeck[i]);
            if ((i+1) % ranks.length == 0) System.out.println();
        }

        System.out.println("Letra random - Magjistari");
        System.out.println(fullDeck[(int)(Math.random()*53)]);
    }
}
