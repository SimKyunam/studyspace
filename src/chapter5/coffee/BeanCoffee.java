package chapter5.coffee;

public class BeanCoffee {
	private int personCount;
	private int money;
	
	public void buy(int money) {
		this.money += money;
		++this.personCount;
		System.out.println("BeanCoffee �մԼ� : "+personCount+"���� :"+this.money);
	}
}
