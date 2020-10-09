package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.*;

@Slf4j
@Configuration
@ComponentScan(basePackageClasses = Main.class)
public class Main {
    public static void main(String[] args) throws SQLException {
        log.info("Hello world!");
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        B b = context.getBean(B.class);
        log.info("" + b);
        context.close();
    }
}
