package dao;

import connection.SingleConnectionBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ModelLogin;

/**
 *
 * @author willian
 */
public class DAOLoginRepository {

    private final Connection connection;

    public DAOLoginRepository() {
        connection = SingleConnectionBase.getConnection();
    }

    public boolean validarAutenticacao(ModelLogin login) throws SQLException {
        String sql = "select * from model_login where upper(login) = upper(?) and upper(senha) = upper(?) ";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, login.getLogin());
        ps.setString(2, login.getSenha());

        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

}
