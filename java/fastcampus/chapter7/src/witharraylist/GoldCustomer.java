package witharraylist;

public class GoldCustomer extends Customer {
	
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		this.bonusRatio = 0.02;
		this.salesRatio = 0.1;
		this.customerGrade = "GOLD";
	}
	
	public int calcPrice(int price) {
		this.bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
}
