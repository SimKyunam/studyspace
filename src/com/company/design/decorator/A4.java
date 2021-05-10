package com.company.design.decorator;

/**
 * Created by mileNote on 2021-05-10
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
public class A4 extends AudiDecorator{
    public A4(ICar audi, String modelName) {
        super(audi, modelName, 2000);
    }
}
