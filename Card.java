//Zach Barden
//CS 110 
//Card Class

public class Card {
	private String suit;
	private String rank;
	private String cardImage;
	
	public Card() {
		rank = "1";
		suit = "s";
		setCardImage(rank + suit + ".jpg");
		
	}
	
	//Creates a card using the number and character input
	public Card(String rank, String suit) {
		this.rank = rank;
		if (suit != "h" || suit != "d" || suit != "s" || suit != "c") {
			
			this.suit = suit;
		}
		else {
			suit = "s";
		}
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public void setCardImage(String cardImage) {
		this.cardImage = cardImage;
	}
	
	public String getCardImage() {
		return this.cardImage;
	}
	
	public boolean equals(String rank, String suit) {
		if (this.rank.equals(rank) && this.suit.equals(suit)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int getValue(Card card){
		String cardRank = card.getRank();
		
		int value = 0;
		
		if(cardRank.equals("jack")){
			value = 11;
		}
		else if(cardRank.equals("queen")){
			value = 12;
		}
		else if(cardRank.equals("king")){
			value = 13;
		}
		else if(cardRank.equals("ace")){
			value = 1;
		}
		else{
			value = Integer.parseInt(cardRank);
		}
		
		return value;
	}
	
	public int compare(Card card1, Card card2) {
		int val1, val2;
		val1 = getValue(card1);
		val2 = getValue(card2);
		
		if(val1 > val2) {
			return 1;
		}
		else if(val1 < val2) {
			return -1;
		}
		else {
			return 0;
		} 
	}

}
