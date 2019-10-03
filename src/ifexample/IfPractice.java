package ifexample;

import java.util.Scanner;

public class IfPractice {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char result;
	
		if(score<60) {
			result = 'F';
		}else if (score<70) {
			result = 'D';
		}else if (score<80) {
			result = 'C';
		}else if (score<90) {
			result = 'B';
		}else {
			result = 'A';
		}
		
		System.out.println(result);
	}
}
