package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.*;

public class Postgre implements Database{
    @Override
    public void connection() {
        try (Connection conn =

                     (Connection) DBConnection.getConnection()) {

            System.out.println("Koneksi berhasil");

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
    public void insertData(){
        try {

            Connection conn = (Connection) DBConnection.getConnection();

            Statement stmt = conn.createStatement();

            stmt.executeUpdate(

                    "INSERT INTO areastatement(code, name, size, blocktrans, yearplant, status) " +

                            "VALUES ('4010101003','62 BU 37', 6.2, 'G4010101003-008', '2026-11-04', 'In Process')"

            );

            System.out.println("Data tersimpan");

            stmt.close();
            conn.close();

            this.selectData();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateData(){
        try {

            Connection conn = (Connection) DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(
                    "UPDATE areastatement " +
                            "SET size = 7.1 " +
                            "WHERE code = '4010101003'"
            );

            System.out.println("Data Terupdate");
            stmt.close();
            conn.close();

            this.selectData();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteData(){
        try {

            Connection conn = (Connection) DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(
                    "DELETE FROM areastatement " +
                            "WHERE code = '4010101003'"
            );

            System.out.println("Data Terhapus ");
            stmt.close();
            conn.close();

            this.selectData();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void selectData() {
        try {

            Connection conn = (Connection) DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs =
                    stmt.executeQuery(
                            "SELECT * FROM areastatement"
                    );

            while(rs.next()) {

                System.out.println(
                        rs.getString("code")
                                + "|"
                                + rs.getString("name")
                                + "|"
                                + rs.getFloat("size")
                                + "|"
                                + rs.getString("blocktrans")
                                + "|"
                                + rs.getDate("yearplant")
                                + "|"
                                + rs.getString("status")
                );
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
