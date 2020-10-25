package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by mileNote on 2020-10-03
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Slf4j
public class Dao {
    private DataSource dataSource;

    public Dao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Transactional
    public void insert() throws SQLException {
        var statement = dataSource.getConnection().createStatement();
        statement.executeUpdate("insert into member(username, password) values('simkyunam', '1234')");
    }

    public void print() throws SQLException {
         var statement = dataSource.getConnection().createStatement();

        var resultSet = statement.executeQuery("select id, username, password from member");
        while (resultSet.next()) {
            var member = new Member(resultSet);
            log.info(member.toString());
        }
    }

}
