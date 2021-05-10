package com.company.design.adapter;

/**
 * Created by mileNote on 2021-05-10
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
public class HairDryer implements Electronic110V{
    @Override
    public void powerOn() {
        System.out.println("헤어 드라이기 110v on");
    }
}
