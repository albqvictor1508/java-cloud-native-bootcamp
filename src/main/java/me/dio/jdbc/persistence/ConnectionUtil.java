package me.dio.jdbc.persistence;

import static lombok.AccessLevel.PRIVATE;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor(access = PRIVATE)
public class ConnectionUtil {
    public Connection getConnection() throws SQLException {
        return DriverManager
                .getConnection("jdbc:mysql://localhost:6000/jdbc-basics", "root", "mysql-pass");
    }
}
