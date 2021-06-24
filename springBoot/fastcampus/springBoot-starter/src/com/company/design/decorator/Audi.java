package com.company.design.decorator;

/**
 * Created by mileNote on 2021-05-10
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
public class Audi implements ICar{

    private int price;

    public Audi(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void showPrice() {
        System.out.println("audi의 가격은 " + this.price);
    }
}
