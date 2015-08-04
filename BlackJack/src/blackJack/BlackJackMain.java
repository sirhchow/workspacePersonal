package blackJack;

import java.util.*;

public class BlackJackMain {
	
	public static Deck myDeck = new Deck();
	public static Hand myHand = new Hand();
	public static Hand dealerHand = new Hand();
	public static Scanner console = new Scanner(System.in);
	
	private static void stand() {
		while (dealerHand.returnValue() < 17) {
			dealerHand.addCard(myDeck.dealCard());
			dealerHand.printCards();
			System.out.println(dealerHand.returnValue());
		}
		
		checkWinner();
		
	}
	
	private void hit() {
		
	}
	private static void checkWinner() {
		if (myHand.returnValue() == 21) {
			System.out.println("Player Wins!");
		}
		
		else if (dealerHand.returnValue() == 21) {
			System.out.println("Dealer Wins!");
		}
		
		else if (myHand.returnValue() > 21) {
			System.out.println("Player Busts!");
		}
		
		else if (dealerHand.returnValue() > 21) {
			System.out.println("Dealer Busts!");
		}
		
		else if (dealerHand.returnValue() == myHand.returnValue()) {
			System.out.println("Push");
		}
	}
	
	public static void main(String[] args) {
		System.out.println ("Welcome to Black Jack");
	
		//myDeck.printDeck();
		myDeck.shuffleDeck();
		myHand.addCard(myDeck.dealCard());
		myHand.addCard(myDeck.dealCard());
		System.out.println("Your Hand.");
		myHand.printCards();
		System.out.println(myHand.returnValue());
		dealerHand.addCard(myDeck.dealCard());
		dealerHand.addCard(myDeck.dealCard());
		System.out.println("Dealer's Hand.");
		dealerHand.printCards();
		System.out.println(dealerHand.returnValue());
		checkWinner();
		System.out.println("Hit or Stand? H/S");
		
		if (console.next().equalsIgnoreCase("S")) {
			stand();
		}
}
}