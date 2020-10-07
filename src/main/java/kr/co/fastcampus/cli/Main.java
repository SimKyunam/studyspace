package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.*;

@Slf4j
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        log.info("Hello world!");
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("dao.xml");
        ConnectionFactory factory = context.getBean(ConnectionFactory.class);
        Connection connection = factory.getConnection();
        log.info(""+ (factory.getConnection() != null));
        context.close();
    }
}
