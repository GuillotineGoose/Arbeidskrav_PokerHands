public class Main {
    public static void main(String[] args){
        var hand = new PokerHand(new Card[]{
                new Card(Suit.SPADE, Rank.NUMBER_2),
                new Card(Suit.HEART, Rank.NUMBER_1),
                new Card(Suit.HEART, Rank.NUMBER_6),
                new Card(Suit.HEART, Rank.NUMBER_8),
                new Card(Suit.HEART, Rank.ACE)
        });

    }
}
