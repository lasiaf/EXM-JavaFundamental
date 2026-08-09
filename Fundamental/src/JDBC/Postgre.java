package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Postgre implements Database{
    @Override
    public void connection() {
        try {

            String url =
                    "jdbc:postgresql://localhost:5433/plantations";

            String user = "postgres";
            String password = "inipassw203";

            Connection conn =
                    DriverManager.getConnection(
                            url,
                            user,
                            password
                    );

            System.out.println("Koneksi berhasil");

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
