package pertemuan5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    private static final String URL = "jdbc:postgresql://localhost:5432/PBO";
    private static final String USER = "postgres";
    private static final String PASS = "elma123";

    public static Connection getConnection() {
        try {
            // Load driver (optional di Java 8+, tapi bagus tetap ditulis)
            Class.forName("org.postgresql.Driver");
            
            // Kembalikan koneksi
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver PostgreSQL tidak ditemukan!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Koneksi database gagal!");
            e.printStackTrace();
        }
        return null; // kalau gagal koneksi
    }
}
