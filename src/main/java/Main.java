import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Hello world!");

        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("org.h2.Driver");
            String url = "jdbc:h2:mem:test;MODE=MySQL;";
            connection = DriverManager.getConnection(url, "sa", "");
            statement = connection.createStatement();

            connection.setAutoCommit(false);

            statement.execute("create table member(id int auto_increment, username varchar(255) not null, password varchar(255) not null, primary key(id))");
            statement.executeUpdate("insert into member(username, password) values('simkyunam', '1234')");

            ResultSet resultSet = statement.executeQuery("select id, username, password from member");
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");

                logger.info("id: "+ id + ", username: " + username + ", password: " + password);
            }
            connection.commit();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
