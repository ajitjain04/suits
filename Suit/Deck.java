//Deck.java

import java.util.*;

class Deck{
	ArrayList<Card> deck; //take rank and suit 

	public Deck(){
		this.deck = new ArrayList<>();
	}
	
	public void createDeck(){
        	String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        	String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		
		for(String suit : suits){
			for(String rank : ranks){
				deck.add(new Card(suit,rank));

			}
		}
	}

	public void displayDeck(){
		for(Card card : deck){
			System.out.println(card);
		}
	}
}