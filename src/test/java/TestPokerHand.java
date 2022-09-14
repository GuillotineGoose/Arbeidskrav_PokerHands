import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPokerHand {

    @Test
    public void highCardTet(){

        var hand = new PokerHand(new Card[]{
                new Card(Suit.SPADE, Rank.NUMBER_2),
                new Card(Suit.HEART, Rank.NUMBER_1),
                new Card(Suit.HEART, Rank.NUMBER_6),
                new Card(Suit.HEART, Rank.NUMBER_8),
                new Card(Suit.HEART, Rank.ACE)
        });
        assertEquals("high card ACE", hand.getScore());
    }

    @Test
    public void pairTest(){
        var hand = new PokerHand(new Card[]{
                new Card(Suit.SPADE, Rank.NUMBER_2),
                new Card(Suit.HEART, Rank.NUMBER_8),
                new Card(Suit.HEART, Rank.NUMBER_6),
                new Card(Suit.HEART, Rank.NUMBER_8),
                new Card(Suit.HEART, Rank.ACE)
        });
        assertEquals("Pair NUMBER_8", hand.getScore());
    }

}
