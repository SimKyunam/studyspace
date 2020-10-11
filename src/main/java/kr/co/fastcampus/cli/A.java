package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by mileNote on 2020-10-08
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Slf4j
@Component
public class A  {
    private B b;

    public A(B b) {
        this.b = b;
    }

    void init(){
        log.error("A post construct" + b);
    }

    void destroy(){
        log.error("A pre destroy");
    }
}
