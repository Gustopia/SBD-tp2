package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
    private static final String url = "jdbc:mysql://localhost:3306/sbd_tp1";
    private static final String user = "root";
    private static final String pass = "";

    public static Connection conectar() throws SQLException {
        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("Erro na conexão à DB: " + e.getMessage());
            throw e;
        }
    }
}
