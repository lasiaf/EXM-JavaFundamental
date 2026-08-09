package JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBConnection {

    private static final Properties props = new Properties();
    static {
        try {
            props.load(
                    new FileInputStream("application.properties")
            );
        } catch (Exception e) {
            throw new RuntimeException(
                    "Gagal membaca application.properties",
                    e
            );
        }
    }
    private static final String URL = props.getProperty("db.url");

    private static final String USER = props.getProperty("db.user");
    private static final String PASSWORD = props.getProperty("db.password");
    public static Connection getConnection() throws SQLException {

        return  DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
        );
    }
}