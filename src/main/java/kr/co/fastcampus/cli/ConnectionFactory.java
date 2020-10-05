package kr.co.fastcampus.cli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by mileNote on 2020-10-04
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
public class ConnectionFactory {
    private String url;
    private String user;
    private String password;

    public ConnectionFactory(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection createConnection() throws SQLException {
       return DriverManager.getConnection(this.url, this.user, this.password);
    }
}
