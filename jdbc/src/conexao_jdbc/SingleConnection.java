package conexao_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author willian
 */
public class SingleConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/posjava";
    private static final String PASSWD = "admin";
    private static final String USER = "postgres";
    
    private static Connection connection = null;

    static {
        conectar();
    }
    
    public SingleConnection() {
        conectar();
    }

    private static void conectar() {
        try {
            if (connection == null) {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWD);
                connection.setAutoCommit(false);
            }
        }
        catch(ClassNotFoundException | SQLException err) {
            System.out.println("Err: "+err.getMessage());
        }
    }
    
    public static Connection getConnection() {
        return connection;
    }
        
    
}
