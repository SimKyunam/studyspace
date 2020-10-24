package kr.co.fastcampus.cli.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mileNote on 2020-10-22
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Service service = context.getBean(Service.class);
        service.log();
        context.close();
    }
}