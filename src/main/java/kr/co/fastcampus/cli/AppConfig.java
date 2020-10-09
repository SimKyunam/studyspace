package kr.co.fastcampus.cli;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by mileNote on 2020-10-08
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Configuration
public class AppConfig {
    @Bean
    @Qualifier("b1")
    public B b1(){
        return new B();
    }

    @Bean
    @Qualifier("b2")
    public B b2(){
        return new B();
    }
}
