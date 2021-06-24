package chapter9.sorting;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("정렬방식을 선택하세요.");
		System.out.println("B : BubbleSort");
		System.out.println("H : heapSort");
		System.out.println("Q : QuickSort");
		
		int chr = System.in.read();
		
		Sort sort = null;
		int[] ary = {1,2,3,4,5}; 
		
		if(chr =='B' || chr =='b') {
			sort = new BubbleSort();
		}else if(chr =='H' || chr =='h') {
			sort = new HeaSort();
		}else if(chr =='Q' || chr =='q') {
			sort = new QuickSort();
		}else {
			System.out.println("ERROR");
			return;
		}
		
		sort.ascedning(ary);
		sort.descending(ary);
		sort.description();
		
	}

}
