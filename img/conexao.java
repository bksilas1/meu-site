import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Configuração da conexão
        String url = "jdbc:mysql://localhost:3306/cadastro";
        String usuario = "root";
        String senha = "123456";
        
        // Tentativa de conexão
        try {
            // Registrar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Estabelecer a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            
            // Se a conexão for bem-sucedida, imprima uma mensagem
            System.out.println("Conexão bem-sucedida!");
            
            // Não se esqueça de fechar a conexão quando terminar de usá-la
            conexao.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados!");
            e.printStackTrace();
        }
    }
}