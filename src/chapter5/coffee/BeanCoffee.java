package chapter5.coffee;

public class BeanCoffee {
	private int personCount;
	private int money;
	
	public void buy(int money) {
		this.money += money;
		++this.personCount;
		System.out.println("BeanCoffee 손님수 : "+personCount+"수익 :"+this.money);
	}
}
