package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sbd_tp1";
        String user = "root";
        String pass = "xxxx";

        // obter ligação ao SGBD
        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            // obter um object que permite executar pedidos sobre a BD
            Statement stmt = conn.createStatement();

            // construir e executar o select
            int codTesteB = 1;
            String select = "SELECT * FROM ENTIDADEA WHERE codTeste = " + codTesteB;
            stmt.execute(select);

            // obter resultSet
            ResultSet rs = stmt.getResultSet();

            // mostrar header
            System.out.println("entidadeA com entidadeB com codTeste = " + codTesteB);

            // mostrar resultados
            while (rs.next()) {
                System.out.println(" " + rs.getInt("codTesteA") + "-" + rs.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}