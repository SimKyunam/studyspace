package practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		int numIf = 0;
		int numSwitch = 0;
		char oper = '-';
		
		if(oper=='+') {
			numIf = num1+num2;
		}else if(oper=='-') {
			numIf = num1-num2;
		}else if(oper=='*') {
			numIf = num1*num2;
		}else {
			numIf = num1/num2;
		}
		
		switch (oper) {
		case '+': 
			numSwitch = num1+num2;
			break;
		case '-': 
			numSwitch = num1-num2;
			break;
		case '*': 
			numSwitch = num1*num2;
			break;
		default:
			numSwitch = num1/num2;
			break;
		}
		
		System.out.println("if 연산 값 "+numIf);
		System.out.println("switch 연산 값 "+numSwitch);
		
		
	}
}
