package coperation;

public class Student {
	private String name;
	private int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void tranTexi(Texi texi, int money) {
		texi.takeTexi(money);
		this.money -= money;
	}
	
	public void showInfo() {
		System.out.println(name + "�л��� �ܵ��� "+money+"�� �Դϴ�.");
	}
}
