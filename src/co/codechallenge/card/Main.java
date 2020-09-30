package co.codechallenge.card;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int action;
        int multiNum;
        Deck deck = new Deck();



        do {
            System.out.println("\u001B[32m Please select your action: \n" +
                    "Press \u001B[31m 1 \u001B[32m to Create a new Deck and Print" +
                    "Press \u001B[31m 2 \u001B[32m to Shuffle the Deck and Print" +
                    "Press \u001B[31m 3 \u001B[32m to Sort the Deck by Suit and Print \n" +
                    "Press \u001B[31m 4 \u001B[32m to Sort the Deck by Rank and Print" +
                    "Press \u001B[31m 5 \u001B[32m to Deal a Single Card" +
                    "Press \u001B[31m 6 \u001B[32m to Deal Multiple Cards\n" +
                    "Press \u001B[31m 7 \u001B[32m to exit : ");

            action = keyboard.nextInt();

            switch (action){
                case 1:

                    System.out.println("\u001B[30m New Deck:");
                    for(Card card: deck.createDeck()){
                        System.out.printf("" +card.printCard()+" ->");
                    }

                    break;

                case 2:
                    System.out.println("\u001B[30m Shuffle Deck:");
                    for(Card card: deck.shuffleDeck()){
                        System.out.printf("" +card.printCard()+" ->");
                    }
                    break;

                case 3:
                    System.out.println("\u001B[30m Sort By Suit:");
                    for(Card card: deck.sortBySuit()){
                        System.out.printf("" +card.printCard()+" ->");
                    }
                    break;

                case 4:
                    System.out.println("\u001B[30m Sort By Rank:");
                    for(Card card: deck.sortByRank()){
                        System.out.printf("" +card.printCard()+" ->");
                    }
                    break;

                case 5:
                    try{
                    deck.dealOneCard();
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("\u001B[36m You don't have any card on the deck, Please try again!");
                        continue;
                    }

                    break;

                case 6:
                        System.out.println("\u001B[34m Enter the number of cards: ");
                        multiNum = keyboard.nextInt();
                            try{
                                deck.dealCards(multiNum);
                            }catch(IndexOutOfBoundsException e){
                                System.out.println(e);
                                System.out.println("\u001B[36m You don't have enough cards on the deck, Please try it again!");
                                continue;
                            }

                    break;
            }

        }while(action != 7);



    }

}
