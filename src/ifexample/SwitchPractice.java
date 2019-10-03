package ifexample;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = 31;
		
		switch(month) {
			case 2 : 
				day = 28;
				break;
			case 4 : case 6 :   
				day = 30;
				break;
			case 7 :
				day = 31;
				break;
			default : 
				System.out.println("ERROR");
				day = 0;
		}
		
		System.out.println("출력 날짜는 " + day);
		
	}

}
