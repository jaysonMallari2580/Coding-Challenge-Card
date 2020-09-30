package co.codechallenge.card;

import java.util.Comparator;

public class SortByRank implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        if(o1.getRank() == o2.getRank()){
            return o1.getSuit().compareTo(o2.getSuit());
        }

        return o1.getRank().compareTo(o2.getRank());
    }
}
