//Zach Barden
//CS 110
//Deck Class

import java.util.ArrayList;
import java.util.Collections;

public class Deck extends Card {
	
	private ArrayList<Card> deck = new ArrayList(51);	
	
	//Creates a 52 card deck
	public Deck() {
			createDeck();
	}
	
	private void createDeck() {
		
		//possible ranks and suits
		String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String[] suits = {"s", "h", "c", "d"};
		
		//nested for loop to assign rank and suit to each value in the deck array list
		for (int i = 0; i < ranks.length; i++) {
			for (int x = 0; x < suits.length; x++)
					this.deck.add(new Card(ranks[i], suits[x]));
		}
	}
	
	public Card getTopCard(){
		
		//gets the top card
		Card top = deck.get(0);
		
		//removes the top card from the deck
		deck.remove(0);
		
		return top;	
	}
	
	public void shuffle() {
		
		//shuffles the deck
		Collections.shuffle(this.deck);
	}

	public ArrayList<Card> getDeck() {
		
		return deck;
	}
	
	public boolean hasNext() {
		//Checks if the deck is empty
		if (deck.isEmpty()) {
			//returns false if the deck is empty
			return false;
		}
		else {
			//returns true if the deck is not empty
			return true;
		}
	}
	
	public String toString(){
		String str="";
		Card tempCard;
		
		//Loop through the arrayList and add to the string
		for(int i=0; i<deck.size(); i++){
			tempCard = deck.get(i);
			str+=tempCard.toString()+ " ";	
		}
		
		return str;
	}
}
