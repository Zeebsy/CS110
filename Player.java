//Zach Barden
//CS 110 Java
//Player Class

import java.util.ArrayList;

public class Player extends Card {
	//Creates the player hand
	private ArrayList<Card> playerHand = new ArrayList(51);
	
	public Player() { 
		playerHand = null;
	}
	
	public Card getTopCard() {
		//Gets the top card of the player's hand
		Card top = playerHand.get(0);
		
		//removes the top card of the player's hand
		playerHand.remove(0);
		
		return top;
		
	}
	
	public Card getWarCard() {
		//Gets the top card of the player's hand
		Card warCard = playerHand.get(0);
		
		playerHand.remove(0);
		
		return warCard;
		
	}
	
	public void setPlayerHand(ArrayList<Card> playerHand) {
		this.playerHand = playerHand;
	}
	
	public ArrayList<Card> getPlayerHand() {
		return playerHand;
	}
	
	public boolean hasCards() {
		return this.playerHand.isEmpty();
	}
	
	public void clear() {
		playerHand = null;
	}

}



