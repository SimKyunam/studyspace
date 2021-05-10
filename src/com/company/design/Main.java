package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by mileNote on 2021-05-10
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
public class Main {
    public static void main(String[] args) {
        ICar audi = new Audi(1000);
        audi.showPrice();

        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();
    }

    //콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
