import org.junit.jupiter.api.Test;

public class TestPokerHand {

    @Test
    public void highCardTet(){

        var hand = new PokerHand(new Card[]{
                new Card(Suit.HEART, Rank.NUMBER_1)
        });
        assertEqual("high card Ace", hand.gerScore);
    }

}
