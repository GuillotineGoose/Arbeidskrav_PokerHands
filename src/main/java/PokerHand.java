import java.util.*;

public class PokerHand {
    private Card[] cards;
    public PokerHand(Card[] cards) {
        this.cards = cards;
    }

    public String getHighCard() {

        var card = cards[0];
        for (var cardInHand : cards){

            if (cardInHand.getRank().compareTo(card.getRank()) > 0){
                card = cardInHand;
            }
        }

        return "high card " + card.getRank();
    }

    public String getPair() {
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

    public String getThreeOfAKind() {
        Map<Rank, ArrayList<Card>> threeOfAKind = new HashMap<>();
        var kind = Rank.NO_RANK;

        for (var card : cards){
            if (threeOfAKind.get(card.getRank()) == null){

                threeOfAKind.put(card.getRank(), new ArrayList<Card>());
            }

            threeOfAKind.get(card.getRank()).add(card);
        }

        for (var i : threeOfAKind.keySet()){
            if (threeOfAKind.get(i).size() == 3)
                kind = i;
        }

        return "Three of a kind " + kind;
    }

    public String getStraight(){
        ArrayList<Card> cardList = new ArrayList<>();
        for(var cardInHand : cards) {
            cardList.add(cardInHand);
            }
        Collections.sort(cardList);
        if (cardList.get(0).getRank().ordinal() == cardList.get(1).getRank().ordinal() - 1){
            if (cardList.get(0).getRank().ordinal() == cardList.get(2).getRank().ordinal() - 2){
                if (cardList.get(0).getRank().ordinal() == cardList.get(3).getRank().ordinal() - 3){
                    if (cardList.get(0).getRank().ordinal() == cardList.get(4).getRank().ordinal() - 4){
                        String cardsInHand = "";
                        for (int x=0; x<5; x++){
                            cardsInHand = cardsInHand + cardList.get(x).getRank().ordinal();
                        }
                        return "Straight! with " + cardsInHand;
                    }
                }
            }
        }


        return  "no straight";
    }
}
