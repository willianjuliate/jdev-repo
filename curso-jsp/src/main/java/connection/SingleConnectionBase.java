package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingleConnectionBase {
    private static final String URL = "jdbc:postgresql://localhost:5432/curso-jsp?autoReconnect=true"; // CONSTANTE
    private static final String USR = "postgres"; // CONSTANTE
    private static final String PASSWD = "admin"; // CONSTANTE
    private static  Connection connection = null;

    public static Connection getConnection() {
        return connection;
    }    
    
    static {
        conectar();
    }

    public SingleConnectionBase() {
        conectar();
    }    
        
    private static void conectar() {
        try {
            if (connection == null) {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(URL, USR, PASSWD);
                connection.setAutoCommit(false); /*Para não efetuar alterações no banco sem nosso comando*/
            }
        }
        catch (ClassNotFoundException | SQLException err) {
            err.printStackTrace();
        }
    }
    
    
}
