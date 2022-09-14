public class PokerHand {
    private Card[] cards;
    public PokerHand(Card[] cards) {
        this.cards = cards;
    }

    public Object getHighCard() {

        var card = cards[0];
        for (var cardInHand : cards){

            if (cardInHand.getRank().compareTo(card.getRank()) > 0){
                card = cardInHand;
            }
        }

        return "high card " + card.getRank();
    }

    public Object getPair() {
        var card = cards[0];
        Rank pair = Rank.NO_RANK;
        Rank tempPair = Rank.NO_RANK;
        for (int x=0; x < cards.length; x++){
            for(int j=x+1; j<cards.length;j++){
                if (cards[x].getRank().compareTo(cards[j].getRank()) == 0) {
                    tempPair = cards[j].getRank();
                    if ((tempPair.compareTo(pair) > 0) || pair == Rank.NO_RANK){
                        pair = tempPair;
                    }
                }
            }
        }
        return "Pair " + pair;
    }

    public Object getThreeOfAKind() {
        return "Three of a kind";
    }
}
