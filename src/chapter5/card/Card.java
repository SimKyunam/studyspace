package chapter5.card;

public class Card {
	private static int cardKey = 1000;
	private int cardNumber = 0;
	
	public Card() {
		cardKey++;
		cardNumber = cardKey; 
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
}
