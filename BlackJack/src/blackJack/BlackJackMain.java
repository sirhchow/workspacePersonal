package blackJack;

public class BlackJackMain {
	
	public static Deck myDeck = new Deck();
	public static Hand myHand = new Hand();
	
			
	public static void main(String[] args) {
		System.out.println ("Welcome to Black Jack");
	
		myDeck.printDeck();
		myDeck.shuffleDeck();
		myHand.addCard(myDeck.dealCard());
		myHand.addCard(myDeck.dealCard());
		myHand.printCards();
		System.out.println(myHand.returnValue());
}
}