package practice;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		System.out.println("홀수를 입력하세요.");	
		Scanner scanner = scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int spaceCount = (count/2)+1;
		
		int starCount = 1;
		int blankCount = 0;
		
		String starPrint;
		
		for(int i=1; i<=count; i++) {
			starPrint = "";
			blankCount = (count-starCount)/2;
			
			for(int j=1; j<=blankCount; j++) {
				starPrint+=" ";
			}
			for(int j=1; j<=starCount; j++) {
				starPrint+="*";
			}
			if(spaceCount <= i) {
				starCount -= 2;
			}else {
				starCount += 2;
			}
			System.out.println(starPrint);
		}
	}
}
