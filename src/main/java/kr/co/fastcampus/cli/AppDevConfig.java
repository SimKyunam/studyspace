package kr.co.fastcampus.cli;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.sql.Connection;

/**
 * Created by mileNote on 2020-10-11
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Configuration
@Profile("dev")
public class AppDevConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public ConnectionFactory connectionFactory(){
        return new ConnectionFactory("org.h2.Driver", "jdbc:h2:file:~/test", "sa,", "");
    }
}
