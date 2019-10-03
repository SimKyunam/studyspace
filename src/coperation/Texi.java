package coperation;

public class Texi {
	private int texiNum;
	private int pessagerCount;
	private int money;
	
	public Texi(int texiNum) {
		this.texiNum = texiNum;
		this.pessagerCount = 0;
		this.money = 0;
	}
	
	public void takeTexi(int money) {
		this.pessagerCount+=1;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("ÅÃ½Ã ¹øÈ£"+texiNum+" ½Â°´ ¼ö "+pessagerCount+" ÃÑ ¼öÀÍ "+money);
	}
}
