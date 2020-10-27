package kr.co.fastcampus.web.entity;

import lombok.*;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by mileNote on 2020-10-03
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Member {
    private int id;
    @NonNull private String username;
    @NonNull private String password;

    public Member(ResultSet resultSet){
        try {
            this.id = resultSet.getInt("id");
            this.username = resultSet.getString("username");
            this.password = resultSet.getString("password");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
