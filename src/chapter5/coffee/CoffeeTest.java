package chapter5.coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		Person Kim = new Person("Kim", 10000);
		Person Lee = new Person("Lee", 10000);
		
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		Kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		Kim.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
		
		
		Lee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
		Lee.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
	}
}
