package com.company.design.adapter;

/**
 * Created by mileNote on 2021-05-10
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
public class Cleaner implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("청소기 220V on");
    }
}
