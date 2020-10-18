package kr.co.fastcampus.cli.res;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mileNote on 2020-10-18
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ResourceExample.class);
        context.refresh();

        ResourceExample re = context.getBean(ResourceExample.class);
        re.print();

        context.close();
    }
}
