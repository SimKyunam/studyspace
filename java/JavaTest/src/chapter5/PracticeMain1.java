package chapter5;

public class PracticeMain1 {
	public static void main(String[] args) {
		String num = "2019072110001";
		String userID = "abc123";
		String date = "2019�� 7�� 21��";
		String name = "ȫ���";
		String id = "PD0345-12";
		String address = "����� ��������";
		
		
		Practice1 order = new Practice1(num, userID, date, name, id, address);
		order.showInfo();
	
	}
}
