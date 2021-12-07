package me.delusidiot.gof.structural_patterns.bridge.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:~test", "sa", "")) {
            String sql = "CREATE TABLE ACCOUNT" +
                    "(id INTEGER NOT NULL, " +
                    " PRIMARY KEY ( id ))";
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
