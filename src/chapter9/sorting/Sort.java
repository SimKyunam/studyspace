package chapter9.sorting;

public interface Sort {

	void ascedning(int[] ary);
	void descending(int[] ary);
	//void description();
	
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
	}
}
