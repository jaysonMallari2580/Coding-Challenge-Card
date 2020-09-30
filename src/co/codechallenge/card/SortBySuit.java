package co.codechallenge.card;

import java.util.Comparator;

public class SortBySuit implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        if(o1.getSuit() == o2.getSuit()){
            return o1.getRank().compareTo(o1.getRank());
        }
        return o1.getSuit().compareTo(o2.getSuit());
    }
}
