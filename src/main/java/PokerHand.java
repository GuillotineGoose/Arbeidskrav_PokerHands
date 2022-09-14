public class PokerHand {
    private Card[] cards;
    public PokerHand(Card[] cards) {
        this.cards = cards;
    }

    public Object getScore() {

        var card = cards[0];
        for (var cardInHand : cards){

            if (cardInHand.getRank().compareTo(card.getRank()) > 0){
                card = cardInHand;
            }
        }

        return "high card " + card.getRank();
    }
}
