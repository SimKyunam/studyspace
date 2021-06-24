package chapter5.card;

public class CardCompany {
	
	private static CardCompany instance = new CardCompany();
	
	public CardCompany() {}
	
	public static CardCompany getInstance() {
		
		if(instance == null) {
			instance = new CardCompany();
		}
		
		return instance;
	}
	
	public static Card createCard() {
		return new Card();
	}
}
