import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {
    // INSERT, UPDATE e DELETE
    public static int executeUpdate(String sql, Object[] params) throws SQLException {
        try (Connection conexao = DBConfig.conectar();
                PreparedStatement pstmt = conexao.prepareStatement(sql)) {

            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }
            return pstmt.executeUpdate();
        }
    }

    // SELECT (retorna lista de resultados)
    public static List<String[]> executeQuery(String sql, Object[] params) throws SQLException {
        List<String[]> resultados = new ArrayList<>();

        try (Connection conexao = DBConfig.conectar();
                PreparedStatement pstmt = conexao.prepareStatement(sql)) {

            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }

            ResultSet rs = pstmt.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();
            int colunas = metaData.getColumnCount();

            while (rs.next()) {
                String[] linha = new String[colunas];
                for (int i = 1; i <= colunas; i++) {
                    linha[i - 1] = rs.getString(i);
                }
                resultados.add(linha);
            }
        }
        return resultados;
    }
}