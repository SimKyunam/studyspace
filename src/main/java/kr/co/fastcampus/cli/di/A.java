package kr.co.fastcampus.cli.di;

/**
 * Created by mileNote on 2020-10-04
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
public class A {
    private B b = new B();

    public void print() {
        b.print();
    }
}
