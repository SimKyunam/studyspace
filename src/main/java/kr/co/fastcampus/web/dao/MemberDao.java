package kr.co.fastcampus.web.dao;

import kr.co.fastcampus.web.entity.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by mileNote on 2020-10-03
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Slf4j
public class MemberDao {
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    void init() {
        jdbcTemplate.update("create table member(id int auto_increment, username varchar(255) not null, password varchar(255))");
        jdbcTemplate.update("insert into member(username, password) values('simkyunam', '1234')");
    }

    @Autowired
    public MemberDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(String username, String password) {
        jdbcTemplate.update("insert into member(username, password) values(?, ?)", username, password);
    }

    public List<Member> list() {
        return jdbcTemplate.query("select id, username, password from member",
                (resultSet, i) -> new Member(resultSet));
    }
}
