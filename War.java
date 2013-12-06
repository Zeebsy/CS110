
public class War extends Card {
	public War(Player p1, Player p2, Card p1Top, Card p2Top) {
		boolean warWinner = false;
		
		
		do {
			//Takes the top card to be given to the winner
			Card p1War = p1.getWarCard();
			Card p2War = p2.getWarCard();
			
			//Takes the next top card to decide the winner
			Card p1Decider = p1.getTopCard();
			Card p2Decider = p2.getTopCard();
			
			//compares the deciding cards. If we have a winner, sets war winner to true
			if (compare(p1Decider, p2Decider) == 1) {
				p1.getPlayerHand().add(p1Top);
				p1.getPlayerHand().add(p2Top);
				warWinner = true;
			}
			else if (compare(p1Decider, p2Decider) == -1) {
				p2.getPlayerHand().add(p2Top);
				p2.getPlayerHand().add(p1Top);
				warWinner = true;
			}
			
		} while (warWinner = false && p1.hasCards() && p2.hasCards());
	}
}
