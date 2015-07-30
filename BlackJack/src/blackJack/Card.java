package blackJack;

public class Card {

	private int value;
	private String rank;
	private String suit;
	
	public Card(int value, String rank, String suit){
		this.value = value;
		this.rank = rank;
		this.suit = suit;
		
	}
	
	public int getValue(){
		return value;
	}
	
	public String getRank(){
		return rank;
	}
	
	public String getSuit(){
		return suit;
	}
	@Override
	public String toString(){
		return rank + " of " + suit;
 	}
}
