package witharraylist;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private int agentID;
	
	public VIPCustomer() {
		this.initCustomer();
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		
		this.bonusRatio = 0.03;
		this.salesRatio = 0.1;
		this.customerGrade = "VIP";
	}
	
	public int calcPrice(int price) {
		this.bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	
}