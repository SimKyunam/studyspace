package chapter5.card;

public class CardCompanyTest {
	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance();
		
		Card mycard = company.createCard();
		Card yourCard = company.createCard();
		
		System.out.println(mycard.getCardNumber());
		System.out.println(yourCard.getCardNumber());
	}
}
