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
        assertEquals("high card ACE", hand.getHighCard());
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
        assertEquals("Pair NUMBER_8", hand.getPair());
    }

    @Test
    public void threeOfAKindTest(){
        var hand = new PokerHand(new Card[]{
                new Card(Suit.SPADE, Rank.NUMBER_8),
                new Card(Suit.HEART, Rank.NUMBER_6),
                new Card(Suit.HEART, Rank.NUMBER_6),
                new Card(Suit.HEART, Rank.NUMBER_3),
                new Card(Suit.HEART, Rank.NUMBER_6)
    });
        assertEquals("Three of a kind NUMBER_6", hand.getThreeOfAKind());
    }

    @Test
    public void straightTest(){
        var hand = new PokerHand(new Card[]{
                new Card(Suit.SPADE, Rank.NUMBER_6),
                new Card(Suit.HEART, Rank.NUMBER_3),
                new Card(Suit.HEART, Rank.NUMBER_5),
                new Card(Suit.HEART, Rank.NUMBER_4),
                new Card(Suit.HEART, Rank.NUMBER_2)
        });

        assertEquals("Straight! with 23456", hand.getStraight());
    }

}
