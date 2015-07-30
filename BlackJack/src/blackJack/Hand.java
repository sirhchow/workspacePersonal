package blackJack;

import java.util.*;
public class Hand {
	
	private ArrayList<Card> myCards;
	
	public Hand(){
		
		myCards = new ArrayList<Card>();
		
	}
	
	public void addCard(Card aCard){
		myCards.add(aCard);
	}
	public void printCards(){
		Iterator itr = myCards.iterator();
		while (itr.hasNext())
			System.out.println(itr.next().toString());
	}
	
	public int returnValue(){
		int totalValue = 0;
		for(Card a : myCards){
			int cardValue = a.getValue();
			totalValue += cardValue;
		}
		return totalValue;
	}
}
