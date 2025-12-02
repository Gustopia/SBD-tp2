public class TestDB {
    public static void main(String[] args) {
        try {
            System.out.println("A tentar conectar...");
            var conn = DBConfig.conectar();
            System.out.println("Conectado com sucesso!");

            conn.close();
        } catch (Exception e) {
            System.out.println("Falha na conexão:");
            e.printStackTrace();
        }
    }
}