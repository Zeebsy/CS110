
import java.util.ArrayList;

public class GameOfWar extends Card {
	private Deck deck;
	private Player p1;
	private Player p2;
	
	public GameOfWar() {
		
		//Set up hands and start game
		setup();
		
	}
	
	public void setup() {
		p1 = new Player();
		p2 = new Player();
		this.deck = new Deck();
		deck.shuffle();
		
		p1.clear();
		p2.clear();
		
		deal(26, p1);
		deal(26,p2);
	}
	
	public void flip() {
		
		do {
			
			//Pulls the card from the top of both p1 and p2 piles
			Card p1Top = p1.getTopCard();
			Card p2Top = p2.getTopCard();
			
			//Compare both cards. A winner will add his card first
			if (compare(p1Top, p2Top) == 1) {
				p1.getPlayerHand().add(p1Top);
				p1.getPlayerHand().add(p2Top);
				
			}
			else if (compare(p1Top, p2Top) == -1) {
				p2.getPlayerHand().add(p2Top);
				p2.getPlayerHand().add(p1Top);
				
			}
			//if they are both equal, then move into war
			else if (compare(p1Top, p2Top) == 0) {
				War war = new War(p1, p2, p1Top, p2Top);
				
			} 
		} while (p1.hasCards() && p2.hasCards());
	}
	
	public void deal(int cards, Player player){
		//deal specified number of cards to the given player
		ArrayList<Card> dealtCards = new ArrayList();
		
		for (int i = 0; i < cards; i++) {
			dealtCards.add(this.deck.getTopCard());
		}
		
		player.setPlayerHand(dealtCards);
	}		
}
