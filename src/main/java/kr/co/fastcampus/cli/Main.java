package kr.co.fastcampus.cli;

import kr.co.fastcampus.cli.aop.TransactionBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

@Slf4j
public class Main {
    public static void main(String[] args) throws SQLException {
        log.info("Hello world!");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.register(TransactionBean.class);
        context.refresh();

        createTable(context.getBean(Connection.class));

        Dao dao = context.getBean(Dao.class);
        dao.insert();
        dao.print();

        context.close();
    }

    public static void createTable(Connection connection) throws SQLException {
        connection.createStatement()
                .execute("create table member(id int auto_increment, username varchar(255) not null, password varchar(255) not null, primary key(id))");
    }
}
