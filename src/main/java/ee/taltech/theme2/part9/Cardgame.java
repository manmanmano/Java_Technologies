package ee.taltech.theme2.part9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cardgame {

    //todo 19.1 build a deck of cards
    // fix tests and add logic
    public static List<Card> buildDeck() {
        List<Card> cards = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(rank, suit));
            }
        }
        return cards;
    }

    public static List<Card> shuffle(List<Card> cards) {
        Collections.shuffle(cards);
        return cards;
    }

    public static void main(String[] args) {
        //todo 19.2 this is more advanced stuff
        // but try to simulate playing poker (buildDeck, shuffle and get 5 cards)
        List<Card> cards = buildDeck();
        List<Card> shuffleDeck = shuffle(buildDeck());
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            hand.add(shuffleDeck.get(i));
        }
        System.out.println(hand);
    }
}
