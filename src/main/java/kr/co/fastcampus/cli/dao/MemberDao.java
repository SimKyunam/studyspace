package kr.co.fastcampus.cli.dao;

import kr.co.fastcampus.cli.entity.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by mileNote on 2020-10-03
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Slf4j
public class MemberDao {
    private JdbcTemplate jdbcTemplate;

    public MemberDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(String username, String password) throws SQLException {
        jdbcTemplate.update("insert into member(username, password) values(?, ?)", username, password);
    }

    public void print() throws SQLException {
        List<Member> list = jdbcTemplate.query("select id, username, password from member",
                (resultSet, i) -> new Member(resultSet));

        list.forEach(x -> log.info("Member: "+ x.getUsername() + "/" + x.getPassword()));
    }
}
