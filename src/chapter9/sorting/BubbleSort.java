package chapter9.sorting;

public class BubbleSort implements Sort{

	public final String sortName = "BubbleSort";
	
	@Override
	public void ascedning(int[] ary) {
		System.out.println(sortName + " ascedning");
	}

	@Override
	public void descending(int[] ary) {
		System.out.println(sortName + " descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println(sortName+" ¿‘¥œ¥Ÿ.");
	}
}
