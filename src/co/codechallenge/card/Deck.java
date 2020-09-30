package co.codechallenge.card;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Deck {

    private List<Card> newDeck = new ArrayList<>();
    private int size;

    public List<Card> createDeck(){
        for(Card.Suit suit : Card.Suit.values()){
            for(Card.Rank rank: Card.Rank.values()){
                newDeck.add(new Card(rank, suit));
            }
        }
        return newDeck;
    }

    public int getSize() {
        return newDeck.size();
    }


    public List<Card> shuffleDeck(){
        Collections.shuffle(newDeck);
        return newDeck;
    }

    public List<Card> sortBySuit(){
         Collections.sort(newDeck, new SortBySuit());

         return newDeck;
    }

    public List<Card> sortByRank(){
        Collections.sort(newDeck, new SortByRank());
        return  newDeck;
    }

    public List<Card> dealOneCard(){
        Card cardRemoved = newDeck.remove(0);
        System.out.println("\u001B[30m"+ cardRemoved.printCard() +" has been removed.");

        return newDeck;
    }

    public List<Card> dealCards(int num){

        for(int i=0;i<num;i++){
            System.out.println("\u001B[30m"+newDeck.remove(0).printCard() + " has been removed.");
        }

        return newDeck;
    }


}
