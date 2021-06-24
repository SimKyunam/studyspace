package chapter9.sorting;

public interface Sort {

	void ascedning(int[] ary);
	void descending(int[] ary);
	//void description();
	
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}
}
