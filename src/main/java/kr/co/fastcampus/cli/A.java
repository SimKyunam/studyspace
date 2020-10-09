package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

/**
 * Created by mileNote on 2020-10-08
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Slf4j
public class A  {
    @Autowired @Qualifier("b1") private B b;
    @Autowired private ApplicationContext context;
    @Value("${catalog.name}")
    String properties;

    @PostConstruct
    void init(){
        log.error("A post construct");
    }

    @PreDestroy
    void destroy(){
        log.error("A pre destroy");
    }
}
