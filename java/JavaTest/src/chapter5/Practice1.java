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
		System.out.println("�ֹ� ��ȣ : " + num);
		System.out.println("�ֹ��� ���̵� : " + userID);
		System.out.println("�ֹ� ��¥ : " + date);
		System.out.println("�ֹ��� �̸� : " + name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + id);
		System.out.println("��� �ּ� : " + address);
	}
}


