package chapter5;

public class PracticeMain1 {
	public static void main(String[] args) {
		String num = "2019072110001";
		String userID = "abc123";
		String date = "2019년 7월 21일";
		String name = "홍길순";
		String id = "PD0345-12";
		String address = "서울시 영등포구";
		
		
		Practice1 order = new Practice1(num, userID, date, name, id, address);
		order.showInfo();
	
	}
}
