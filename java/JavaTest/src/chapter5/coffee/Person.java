package chapter5.coffee;

public class Person {
	private String name;
	private int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void buyStarCoffee (StarCoffee coffee, int money) {
		this.money -= money;
		coffee.buy(money);
		System.out.println(this.name+"ÀÇ ÀÜ°í´Â " +this.money);
	}
	
	public void buyBeanCoffee (BeanCoffee coffee, int money) {
		this.money -= money;
		coffee.buy(money);
		System.out.println(this.name+"ÀÇ ÀÜ°í´Â " +this.money);
	}
}
