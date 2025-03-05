
// Main.java

import java.util.*;

class Main {
    public static void main(String args[]) {
        Deck deck = new Deck();
        System.out.println("*******Creating Deck********");
        deck.createDeck();
        System.out.println("*******Printing Deck********");
        deck.displayDeck();
        System.out.println("*******Shuffling Deck********");
        deck.shuffleDeck();
        deck.displayDeck();

        System.out.println("******Distributing cards among 3 players****");
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Player player3 = new Player("Player 3");

        distributeCards(deck, player1, player2, player3);

        player1.showHand();
        player2.showHand();
        player3.showHand();
    }
}
