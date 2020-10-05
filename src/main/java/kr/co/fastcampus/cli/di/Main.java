package kr.co.fastcampus.cli.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mileNote on 2020-10-04
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
public class Main {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("dao.xml");
       A a = context.getBean("a", A.class);
       a.print();
    }
}
