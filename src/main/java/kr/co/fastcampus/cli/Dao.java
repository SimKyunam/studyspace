package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by mileNote on 2020-10-03
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Slf4j
public class Dao {
    private Connection connection;

    public Dao(Connection connection) {
        this.connection = connection;
    }

    public void insert() throws SQLException {
        var statement = connection.createStatement();
        statement.executeUpdate("insert into member(username, password) values('simkyunam', '1234')");
    }

    public void print() throws SQLException {
         var statement = connection.createStatement();

        var resultSet = statement.executeQuery("select id, username, password from member");
        while (resultSet.next()) {
            var member = new Member(resultSet);
            log.info(member.toString());
        }
    }

}
