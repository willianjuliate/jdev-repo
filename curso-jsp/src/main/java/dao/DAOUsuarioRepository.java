package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.SingleConnectionBase;
import model.ModelLogin;

public class DAOUsuarioRepository {
	
	private Connection connection;
	
	public DAOUsuarioRepository() {
		connection = SingleConnectionBase.getConnection();
	}
	
	public void gravarUsuario(ModelLogin mdl) throws SQLException {			
		String sql = " INSERT INTO model_login (login, senha, nome, email) VALUES (?, ?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, mdl.getLogin());
		statement.setString(2, mdl.getSenha());
		statement.setString(3, mdl.getNome());
		statement.setString(4, mdl.getEmail());
		
		statement.execute();
		connection.commit();
	}
}
