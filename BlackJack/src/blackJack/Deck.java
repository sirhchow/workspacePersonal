package blackJack;

import java.util.*;

public class Deck {
	
	private ArrayList<Card> myDeck = new ArrayList<Card>();
	
	public Deck(){
		String rank = "";
		String suit = "";
		int value;
		
				
		for(int i = 1; i <= 4; i++){
			
							
			for(int k = 2; k <= 14; k++){
				
				
				
				switch (k){
				
				case 11:  rank = "Jack";
						  value = 10;
						  break;
						  
				case 12:  rank = "Queen";
						  value = 10;
						  break;
						  
				case 13:  rank = "King";
						  value = 10;
						  break;
						  
				case 14:  rank = "Ace";
						  value = 11;
						  break;
						  
				default:  rank = Integer.toString(k);
						  value = k;
				}
				
				switch (i){
				
				case 1:   suit = "Spades";
						  break;
				
				case 2:   suit = "Hearts";
						  break;
				  		  
				case 3:   suit = "Clubs";
				  		  break;
				  
				case 4:  suit = "Diamonds";
				  		  break;
				}
				Card myCard = new Card(value, rank, suit);
				myDeck.add(myCard);
				}
		}

				
	}
				
	public void printDeck(){
		Iterator itr = myDeck.iterator();
		while (itr.hasNext())
			System.out.println(itr.next().toString());
	}

	public int cardsLeft(){
		return myDeck.size();
	}
	
	public Card dealCard(){
		return myDeck.remove(0);
		
	}
	
	public void shuffleDeck(){
		Collections.shuffle(myDeck);
		System.out.println("Shuffling Deck");
	}
}
