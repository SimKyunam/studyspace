package chapter5;

public class Practice1 {
	private String num;
	private String userID;
	private String date;
	private String name;
	private String id;
	private String address;
	
	public Practice1(String num, String userID, String date, String name, String id, String address){
		this.num = num;
		this.userID = userID;
		this.date = date;
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public void showInfo() {
		System.out.println("주문 번호 : " + num);
		System.out.println("주문자 아이디 : " + userID);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문자 이름 : " + name);
		System.out.println("주문 상품 번호 : " + id);
		System.out.println("배송 주소 : " + address);
	}
}


