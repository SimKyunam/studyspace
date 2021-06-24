package com.company.design.strategy;

/**
 * Created by mileNote on 2021-05-15
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
public class NormalStrategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return text;
    }
}
