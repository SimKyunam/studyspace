package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		char[] arryEng1 = {'A', 'B', 'C', 'D'};
		char[] arryEng2 = new char[60];
		
		int count = 0;
		
		char ch = 'A';
		
		for(int i=0; i<arryEng1.length; i++) {
			System.out.print(arryEng1[i]);
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0; i<26; i++) {
			arryEng2[i] = (char)(i+65);
			count++;
		}
		
		for(int i=0; i<count; i++) {
			System.out.print(arryEng2[i]);
		}
		
	}
}
