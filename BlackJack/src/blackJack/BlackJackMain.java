package blackJack;

import java.util.*;

public class BlackJackMain {
	
	public static Deck myDeck = new Deck();
	public static Hand myHand = new Hand();
	public static Hand dealerHand = new Hand();
	public static Scanner console = new Scanner(System.in);
	public static String a;
	
	private static boolean checkBlackJack() {
		if (myHand.returnValue() == 21) {
			System.out.println("Player Wins!");
			return true;
		}
		
		else if (dealerHand.returnValue() == 21) {
			System.out.println("Dealer Wins!");
			return true;
		}
		
		return false;
		
	}
	private static void stand() {
		while (dealerHand.returnValue() < 17) {
			System.out.println("Dealer Draws!");
			dealerHand.addCard(myDeck.dealCard());
			dealerHand.printCards();
			System.out.println(dealerHand.returnValue());
		}
		
		checkWinner();
		
	}
	
	private static void hit() {
		if (myHand.returnValue() < 21) {
			myHand.addCard(myDeck.dealCard());
			myHand.printCards();
			System.out.println(myHand.returnValue());
		}else{
			System.out.println("Player Busts!");
		}
		
		
	}
	
	private static boolean checkWinner() {
		if (myHand.returnValue() > 21) {
			System.out.println("Player Busts!");
			return true;
		}
		
		else if (dealerHand.returnValue() > 21) {
			System.out.println("Dealer Busts!");
			System.out.println("Player Wins!");
			return true;
		}
		
		else if (dealerHand.returnValue() == myHand.returnValue()) {
			System.out.println("Push");
			return true;
		}
		
		else if (dealerHand.returnValue() > myHand.returnValue()) {
			System.out.println("Dealer Wins!");
			return true;
		}
		
		else if (myHand.returnValue() > dealerHand.returnValue()) {
			System.out.println("Player Wins!");
			return true;
		}
		
		return false;
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
		
		checkBlackJack();
				
		System.out.println("Hit or Stand? H/S");
		
		a = console.next();
		
		while (a.equalsIgnoreCase("H")) {
			hit();
			System.out.println("Hit or Stand? H/S");
			a = console.next();
		}
		
		if (a.equalsIgnoreCase("S")) {
			stand();
		}
		
}
}