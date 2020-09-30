package co.codechallenge.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {
    private Rank rank;
    private Suit suit;

    public enum Rank {ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING};
    public enum Suit {CLUBS,SPADES,HEARTS,DIAMONDS};


    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit=suit;
    }

    public Rank getRank(){
        return this.rank;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public String printCard(){
        return rank+ " of "+suit;
    }
}
